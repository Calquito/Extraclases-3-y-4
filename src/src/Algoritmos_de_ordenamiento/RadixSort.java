package com.company;

import java.util.Random;
import java.util.LinkedList;

public class RadixSort {

    private static final int LENGTH = 10;

    private static LinkedList[] q = {
            new LinkedList(), // 0
            new LinkedList(), // 1
            new LinkedList(), // 2
            new LinkedList(), // 3
            new LinkedList(), // 4
            new LinkedList(), // 5
            new LinkedList(), // 6
            new LinkedList(), // 7
            new LinkedList(), // 8
            new LinkedList() // 9
    };

    public static void main(String[] args)
    {
        Object[] list = new Object[LENGTH];
        for(int r=0; r < LENGTH; r++){
            list[r] = new Random().nextInt(10 * 10);
        }
        Object[] sortedList = sort(list);
        for(int i=0; i < sortedList.length; i++){
            System.out.println(sortedList[i]);
        }
    }

    public static Object[] sort(Object[] list)
    {
        int maxDigits = getMaxDigits(list);
        for(int r=1; r <= maxDigits; r++){
            int radix;
            for(int n=0; n < list.length; n++){
                radix = getDigitAt(Integer.parseInt(list[n].toString()), r);
                q[radix].offer(list[n]);
            }
            int a=0;
            for(int k=0; k < q.length; k++){
                while(q[k].peek() != null){
                    list[a++] = q[k].poll();
                }
            }
        }
        return list;

    }

    public static int getMaxDigits(Object list[])
    {
        int maxDigits = 0;
        int digits;
        for(int i=0; i < list.length; i++){
            digits = getDigits(Integer.parseInt(list[i].toString()));
            if(digits > maxDigits){
                maxDigits = digits;
            }
        }
        return maxDigits;
    }


    public static int getDigits(int i)
    {
        if(i < 10){
            return 1;
        }
        return 1 + getDigits(i / 10);
    }

    public static int getDigitAt(int number, int radix)
    {
        return (int)(number / Math.pow(10,radix-1)) % 10;
    }
}