import java.util.Scanner;

public class single_linklist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
         do{
            System.out.println("Enter the Data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to continue @press 1!!!");
            n=sc.nextInt();
        }while(n==1);
    }

    
    void traverse(){
        Node temp = head;
        if(head==null){
            System.out.println("linkedlist does not exixts");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
public static void main(String[] args) {
    single_linklist ll = new single_linklist();
    ll.creation();
    ll.traverse();
}
    }

