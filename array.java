
import java.util.Scanner;

class array {
   public static void main(String[] args) {
      int n;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the no of elements of 1D array");
      n = s.nextInt();
      int a[] = new int[n];
      System.out.println("enter the values");
      for (int i = 0; i < n; i++) {
         a[i] = s.nextInt();
      }
      System.out.print("The Elements are -: ");
      for (int i = 0; i < n; i++) {
         System.out.print(a[i]);
      }
   }
}