package SinglyLinkedList;


import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }

        System.out.print("null");
    }

    public int length() {
        if(head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position,int value) {
        ListNode node = new ListNode(value);
        if(position == 1) {
            node.next = head;
            head = node;
            return;
        }else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public ListNode deleteFirst() {
        if(head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;

//        sll.insertFirst(11);
//        sll.insertLast(12);
//        sll.insertFirst(4);
//        sll.insertFirst(10);
//
//
//        sll.display();
//
//        int count = sll.length();
//        System.out.println(count);

        sll.insert(1,3);
        sll.insert(2,5);
        sll.insert(1, 2);
        sll.display();




    }


}
