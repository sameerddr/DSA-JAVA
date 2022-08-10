
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

    }
    
}
