package Lista_enlazada;

public class Node<T extends Comparable<T>> {
    public T value;
    public Node<T> next;
    public Node<T> prev;

    Node(T value){
        this.value = value;
        this.next = null;
        //this.prev = null;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    //public Node_of_pieces<T> getPrev() {
    //   return this.prev;
    //}
//
//    public void setPrev(Node_of_pieces<T> prev) {
//        this.prev = prev;
//    }

    public String valueStr(){
        String value = "";
        value += this.value;
        return value;
    }
}