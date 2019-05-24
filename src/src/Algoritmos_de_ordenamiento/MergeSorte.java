package src.Algoritmos_de_ordenamiento;

import Lista_enlazada.Linked_List;

import java.util.List;

public class MergeSorte<T extends Comparable<T>> {
    T element;
    public static void main(String[] args) {

        MergeSorte<Integer> ml = new MergeSorte<>();
        Linked_List<Integer> l1 = new Linked_List<>();
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(7);
        l1.addLast(5);
        l1.addLast(3);
        l1.addLast(0);
        l1.addLast(9);
        System.out.println(l1.printL());
        System.out.println("calling mergesort");
        Linked_List<Integer> result = ml.mergesort(l1);
        System.out.println(result.printL());

        MergeSorte<String> ml2 = new MergeSorte<>();
        Linked_List<String> l2 = new Linked_List<>();
        l2.addLast("eight");
        l2.addLast("six");
        l2.addLast("seven");
        l2.addLast("five");
        l2.addLast("three");
        l2.addLast("oh");
        l2.addLast("nein");
        System.out.println(l2.printL());
        System.out.println("calling mergesort");
        Linked_List<String> result2 = ml2.mergesort(l2);
        System.out.println(result2.printL());

        String hola = "hola";
        System.out.println(hola.getClass().toString());

    }

    //call mergesort on param list
    public Linked_List<T> mergesort(Linked_List<T> lista) {
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

