package src.Algoritmos_de_ordenamiento;

import Lista_enlazada.Linked_List;

import java.util.List;

public class MergeSorte<T extends Comparable<T>> {

    public static Linked_List<T> mergesort(Linked_List<T> lista) {
        if(lista.length <= 1) {
            return lista;
        } else {
            Linked_List<T> left = new Linked_List<T>();
            Linked_List<T> right = new Linked_List<T>();

            int middle = lista.length / 2; //int division
            for(int i=0;i<middle;i++) {
                left.addLast(lista.get(i));
            }
            for(int i=middle;i<lista.length;i++) {
                right.addLast(lista.get(i));
            }
            return merge(mergesort(left), mergesort(right));
        }
    }

    //used by mergesort to do merging
    private Linked_List<T> merge(Linked_List<T> lista_A, Linked_List<T> lista_b) {
        Linked_List<T> result = new Linked_List<T>();	//return list
        int a_idx = 0, b_idx = 0;			//counters of items left in respective lists

        while(a_idx+1 <= lista_A.length || b_idx+1 <= lista_b.length) {
            if(a_idx+1 <= lista_A.length && b_idx+1 <= lista_b.length) {
                if(lista_A.get(a_idx).compareTo(lista_b.get(b_idx)) <= 0.0) {
                    result.addLast(lista_A.get(a_idx));
                    a_idx++;
                } else {
                    result.addLast(lista_b.get(b_idx));
                    b_idx++;
                }
            } else if(a_idx+1 <= lista_A.length) {
                result.addLast(lista_A.get(a_idx));
                a_idx++;
            } else if(b_idx+1 <= lista_b.length) {
                result.addLast(lista_b.get(b_idx));
                b_idx++;
            }
        }
        return result;
    }

}

