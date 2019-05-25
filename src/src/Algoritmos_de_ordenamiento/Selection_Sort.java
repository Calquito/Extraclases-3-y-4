package Algoritmos_de_ordenamiento;

import Lista_enlazada.Linked_List;

class SelectionSort<T extends Comparable<T>> {

    public static void main(String args[]) {
        Linked_List lista=new Linked_List();
        lista.addLast(55);
        lista.addLast(22);
        lista.addLast(5946);
        lista.addLast(1);
        lista.addLast(1);
        lista.addLast(986);
        lista.addLast(-5454);
        lista.addLast(-59);
        lista.printL();
        lista.get(4);
        SelectionSort selectionsort=new SelectionSort();
        selectionsort.sort(lista);
        lista.printL();
    }
    public void sort(Linked_List lista) {
        int n = lista.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                try {
                    if(lista.get(j).compareTo(lista.get(min_idx))<0)
                        min_idx = j;
                }
                catch (Exception e){
                    System.out.println("error en los datos ingresados");
                }


            T temp = (T) lista.get(min_idx);
            lista.set(min_idx,lista.get(i));
            lista.set(i,temp);
        }
    }

    /*
        void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
     */
}
