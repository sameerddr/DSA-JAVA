import java.util.Scanner;
public class two_darray {
    public static void main(String[] args) {
        int n,m;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        n=sc.nextInt();
        System.out.println("Enter the cols");
        m=sc.nextInt();

        int a [][]  = new int[n][m];

            System.out.println("enter the values");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    a[i][j] = sc.nextInt();
                    
                }
                
            }

            System.out.println("printing the elements");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
    }
}
