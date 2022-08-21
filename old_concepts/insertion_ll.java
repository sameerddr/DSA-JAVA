import java.util.Scanner;

public class insertion_ll {

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
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);
         do{
            System.out.println("Enter the Data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {

                System.out.println(
                    "Enter 1 to insert the item at begining , 2 to insert at the end and 3 to insert at any(i) position");
                 m = sc.nextInt();
                switch (m) {
                case 1:
                    new_node.next = head;
                    head = new_node;
                    break;
                case 2:
                    Node temp = head;
                 while (temp.next!=null) {
                    temp.next = new_node;                
                 }
                  break;
                  case 3:
                  System.out.println("enter the position where you want to add the new node ");
                   p = sc.nextInt();
                  Node temp1 = head;
                  for (int i = 0; i < p-1; i++) {
                    temp1 = temp1.next;
                  }
                  new_node.next = temp1.next;
                  temp1.next = new_node;
                  break;
                  default: System.out.println("error");
                    break;
                }
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
    insertion_ll ll = new insertion_ll();
    ll.creation();
    ll.traverse();
}
    }





