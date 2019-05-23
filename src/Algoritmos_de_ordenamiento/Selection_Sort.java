package Algoritmos_de_ordenamiento;

import Lista_enlazada.Linked_List;

class SelectionSort {
    public static void main(String args[]) {
        Linked_List lista=new Linked_List();
        lista.addLast(55);
        lista.addLast(22);
        lista.addLast(5946);
        lista.addLast(1);
        lista.printL();
        lista.get(3);
    }
/*    public static void sort(Linked_List lista) {
        int n = lista.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }*/
}
