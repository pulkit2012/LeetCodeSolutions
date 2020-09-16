package LinkedList;

public class AddTwoNumber {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;

    //Create Your Method
    public static Node MyMethod(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
          temp = temp.next;
          count++;
        }
        temp = head;
        int looper = 0;
        if(count == n){
            head = head.next;
            return head;
        }
        while (temp != null){
            looper++;
            if(looper == (count - n)){
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
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

        push(1);
        // push(5);
        printList(MyMethod(head,1));
    }
}
