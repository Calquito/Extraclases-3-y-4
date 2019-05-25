package Algoritmos_de_ordenamiento;

import List.LinkedList;
import List.Node;

public class BubbleSort{

    public static void sort(LinkedList list) {
        if (list.length> 1) {
            for (int i = 0; i < list.length; i++ ) {
                Node currentNode = list.getHead();
                Node next = list.getHead().getNext();
                for (int j = 0; j < (list.length - 1); j++){
                    if ((currentNode.getValue()).compareTo(next.getValue()) >= 0) {
                        Comparable temp = currentNode.getValue();
                        currentNode.setValue(next.getValue());
                        next.setValue(temp);
                    }
                    currentNode = next;
                    next = next.getNext();

                }
            }
        }
    }
}
