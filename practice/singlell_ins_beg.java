
package practice;

import java.util.*;

import javax.lang.model.element.Element;

public class singlell_ins_beg {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter The Data ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("enter 0 to insert the data at the begining");
                new_node.next = head;
                head = new_node;
            }
            System.out.println("press 1 for continue");
            n = sc.nextInt();
        } while (n == 1);

    }

    void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Does Not exists");
        }

        else {
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        singlell_ins_beg ll = new singlell_ins_beg();
        ll.creation();
        ll.traverse();
    }

}
