package LinkedList;

import java.util.Stack;

public class InsertAtTail {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;

    //Create Your Method
    public static Node MyMethod(Node head) {
         Node head2 = head;
         Node temp2 = head2;
         while (head != null){
            if(head.data != temp2.data){
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
         }
         return head2;
    }

    static void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(4);
        push(4);
        push(3);
        push(3);
        push(2);
        push(2);
        push(2);
        push(1);
        // push(5);
        System.out.println("Given linked list ");
        printList(head);
        printList(MyMethod(head));
    }
}
