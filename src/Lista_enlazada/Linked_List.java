package Lista_enlazada;


public class Linked_List<T> {
    private static Linked_List LinkedList;
    public Node head;
    private Node tail;
    public int length;


    public Node getHead() {
        return head;
    }

    public void List(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void addLast(T value){
        length += 1;
        if (head == null){
            head = new Node(value);
            tail = new Node(value);
        } else {
            Node tmp = (Node) this.head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.next = new Node(value);
            //tmp.next.prev = tmp;
            tail = tmp.getNext();

        }
    }

    public Object get(int index){
        int cont=0;
        Node tmp = head;
        Object result=null;
        while (tmp != null){
            if (cont==index){
                System.out.println(tmp.getValue().toString());
                result=tmp.getValue();
            }
            tmp = tmp.getNext();
            cont++;
        }
        return result;
    }
    public void set(int index, T value){
        int cont=0;
        Node tmp = head;
        while (tmp != null){
            if (cont==index){
                tmp.value= (Comparable) value;
            }
            tmp = tmp.getNext();
            cont++;
        }
    }

    public String printL(){
        Node tmp = head;
        String result = "[ ";
        while (tmp != null){
            if (tmp.getNext() != null){
                result += (tmp.getValue().toString()+ " , ");
            } else {
                result += tmp.getValue().toString();
            }
            tmp = tmp.getNext();
        }
        result += " ]";
        System.out.println(result);
        return result;
    }
    public void delete(T value){
        Node tmp = head;
        if (this.getHead().getValue().equals(value)){
            this.head = head.next;
            this.length -= 1;

        } else {
            while (tmp.next != null){
                if ((tmp.next.getValue()).equals(value)){
                    tmp.next = tmp.next.next;
                    length -= 1;
                } else {
                    tmp = tmp.next;
                }
            }
        }
    }




}