package Algoritmos_de_ordenamiento;

import Lista_enlazada.Linked_List;

public class InsertionSort <T extends Comparable<T>> {
    public static Linked_List<T> sort(Linked_List<T> lista) {
        int largo = lista.length;
        for (int i = 1; i < largo; ++i) {
            for (int j = i; j > 0; --j) {
                if (lista.get(j-1).compareTo(lista.get(j)) > 0) {
                    T temp = lista.get(j-1);
                    lista.set(j-1,lista.get(j));
                    lista.set(j,temp);
                }
            }
        }
        return lista;
    }

}
