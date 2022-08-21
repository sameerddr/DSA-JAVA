package practice;

// import java.util.Scanner;

public class singlell_ins_end {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
             this.next = next;
                    }
    }

    Node head = null;

    void creation() {
        int data, n;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;

            }
            System.out.println("Press 1 for continue");
            n = sc.nextInt();
        } while (n == 1);

    }

    void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Does Not exists");
        } else {
            // Node temp = head;
            while (temp != null) {
                temp = temp.next;
            }
            Node new_node;
            temp.next! = new_node;
        }
    }

    public static void main(String[] args) {
        singlell_ins_end ll = new singlell_ins_end();
        ll.creation();
        ll.traverse();
    }
}
