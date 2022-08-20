package practice;
import java.util.Scanner;
public class siglell {
    
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
             this.next = next;
        }
    }
    Node head = null;
    
void creation(){
    int data,n;

    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Enter the data");
        data = sc.nextInt();
      Node new_node = new Node(data);
      if(head == null){
        head = new_node;
      }
      else{
        new_node.next = head;
        head = new_node;

      }
      System.out.println("Press 1 for continue");
      n = sc.nextInt();
    } while (n==1);
      

}
    void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked List Does Not exists");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        siglell ll = new siglell();
        ll.creation();
        ll.traverse();
    }
}

