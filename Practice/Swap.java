package Practice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.println("Enter a value of A: ");
        int a = input.nextInt();
        System.out.println("Enter a value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swaping done...");
        System.out.println("Value of is A: " + a);
        System.out.println("Value of is B: " + b);
    }
}
