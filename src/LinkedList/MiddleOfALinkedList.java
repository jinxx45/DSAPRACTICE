package LinkedList;

public class MiddleOfALinkedList {
    public static void main(String[] args) {
        // Test Case 1: Odd length linked list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Test Case 1 (Odd Length): Middle Node is " + middleOfLinkedList(head1).val); // Expected Output: 3

        // Test Case 2: Even length linked list
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);

        System.out.println("Test Case 2 (Even Length): Middle Node is " + middleOfLinkedList(head2).val); // Expected Output: 4

        // Test Case 3: Single node linked list
        ListNode head3 = new ListNode(1);

        System.out.println("Test Case 3 (Single Node): Middle Node is " + middleOfLinkedList(head3).val); // Expected Output: 1

        // Test Case 4: Empty linked list
        ListNode head4 = null;

        System.out.println("Test Case 4 (Empty List): Middle Node is " + (middleOfLinkedList(head4) == null ? "null" : middleOfLinkedList(head4).val)); // Expected Output: null
    }

    private static ListNode middleOfLinkedList(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(fastPointer!=null && fastPointer.next!= null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    // ListNode class definition (You can implement middleOfLinkedList function here)
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}