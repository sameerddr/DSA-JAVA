import java.util.Scanner;
public class deletion {
    

    public static void main(String[] args) {
        int n , m;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n-1];
        System.out.println("Enter the values of the array ");
        for (int i = 0; i < n; i++) {
                a[i]  = sc.nextInt();
        }

        System.out.println("Enter the Index of the Element that where you want to add a number");
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {  // 10 20  30n 40 50
            if(i<m){
                b[i] = a[i];
            }
            else if(i==m){    
                continue;           // 30
            }
            else{                         
                b[i-1] = a[i];
            }
        }
        System.out.println("elements are -:");
        for (int i = 0; i < n-1; i++) {
            System.out.println(b[i]);
        }
    }
}

