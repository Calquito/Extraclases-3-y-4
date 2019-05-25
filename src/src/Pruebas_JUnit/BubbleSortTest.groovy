package Pruebas_JUnit

import Algoritmos_de_ordenamiento.BubbleSort
import Lista_enlazada.LinkedList
import org.junit.jupiter.api.Test

class BubbleSortTest extends BubbleSort {


    @Test
    /**
     *Prueba con un elemento
     */
    void Test1(){
        LinkedList list = new LinkedList()
        list.addLast(15)
        BubbleSort.sort(list)
        list.printL()
    }
    @Test
    /**
     * Prueba con varios elementos
     */
    void Test2(){
        LinkedList list = new LinkedList()
        list.addLast(1)
        list.addLast(12)
        list.addLast(15)
        list.addLast(78)
        list.addLast(45)
        list.addLast(32)
        list.addLast(9)
        list.addLast(24)
        list.addLast(38)
        list.addLast(51)
        BubbleSort.sort(list)
        list.printL()
    }
    @Test
    /**
     * Prueba con Strings
     */
    void Test3(){
        LinkedList list = new LinkedList()
        list.addLast("hola")
        list.addLast("adios")
        list.addLast("sabana")
        list.addLast("celular")
        list.addLast("televisor")
        list.addLast("mesa")
        list.addLast("raton")
        list.addLast("gato")
        list.addLast("perro")
        BubbleSort.sort(list)
        list.printL()
    }

    @Test
    /**
     * Prueba con el mismo elemento
     */
    void Test4(){
        LinkedList list = new LinkedList()
        list.addLast(10)
        list.addLast(10)
        list.addLast(10)
        BubbleSort.sort(list)
        list.printL()
    }

    @Test
    /**
     * Prueba con elementos ordenados
     */
    void Test5(){
        LinkedList list = new LinkedList()
        list.addLast(1)
        list.addLast(2)
        list.addLast(3)
        list.addLast(4)
        list.addLast(5)
        list.addLast(6)
        BubbleSort.sort(list)
        list.printL()
    }
}
