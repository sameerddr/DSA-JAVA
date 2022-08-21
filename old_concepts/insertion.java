
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        int n , m, p;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        System.out.println("Enter the values of the array ");
        for (int i = 0; i < n; i++) {
                a[i]  = sc.nextInt();
        }

        System.out.println("Enter the Index of the Element that where you want to add a number");
        m = sc.nextInt();
        System.out.println("Enter the value to be added");
        p= sc.nextInt();

        for (int i = 0; i < n+1; i++) {  // 10 20 
            if(i<m){
                b[i] = a[i];
            }
            else if(i==m){               // 30
                b[i]=p;
            }
            else{                         // 
                b[i] = a[i+1];
            }
        }
        System.out.println("elements are -:");
        for (int i = 0; i < n-1; i++) {
            System.out.println(b[i]);
        }
    }
}
