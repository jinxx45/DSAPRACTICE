package LinkedList;

class LinkedList{

    static class Node{
        int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;

    //Adding  element at the end of the linked list
    public void add(int data){
        Node newNode = new Node(data);
        //IF THE LINKED LIST IS EMPTY
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void delete(int data){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Element to be deleted not found");
            return;
        }
        temp.next = temp.next.next;
    }

    public void display(){

        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void insert(int data, int pos){
        if(head== null){
            System.out.println("LinkedList is empty");
            return;
        }

        Node newNode = new Node(data);
        if(pos == 0){
            newNode.next = head.next;
            head = newNode;
            return;
        }

        int counter = 1;
        Node temp = head;
        while(temp.next!=null && counter != pos ){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Position Out of Bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current!= null){
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
        }

        head = prev;
    }


}

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.display();

        list.delete(20);
        System.out.println("After Deleting 20:");
        list.display();

        list.insert(25, 1);
        System.out.println("After Inserting 25 at Position 1:");
        list.display();
    }

}
