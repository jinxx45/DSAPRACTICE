package LinkedList;


public class DoubleLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        newNode.prev = temp;
        temp.next = newNode;
    }

    public void delete(int data){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        if(head.data == data){
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }


        Node temp = head;
        Node prev = head;
        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Element not found");
        }

        if (temp.next == null) {
            temp.prev.next = null;
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;



    }

    public void display(){
        if(head==null) System.out.println("Empty LinkedList");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public void reverse(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = null;
        Node current = head;

        while(current!= null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        head = temp.prev;
    }


    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);

        dll.display();
        dll.reverse();
        dll.display();

        dll.delete(20);
        dll.delete(10);
        dll.delete(40);

        dll.add(15);
        dll.delete(15);

        dll.display();



    }
}
