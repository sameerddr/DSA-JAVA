package stacks;

import java.util.*;

class stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];

    void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.println("enter data");
            int i = sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.println("Item Inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("underflow");
        } else {
            top = top - 1;
            System.out.println("item deleted");
        }
    }

    void display() {
        System.out.println("Items are");
        for (int j = top; j > 0; j--) {
            System.out.println(a[j]);
        }
    }

}

class stack_using_araay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int l;
        do {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            int d = sc.nextInt();
            switch (d) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
            System.out.println("enter 0 go to back to menu");
            System.out.println("enter any key to exit");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("exits succesfully");
    }

}