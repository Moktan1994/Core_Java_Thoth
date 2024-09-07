package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Programme");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name);

        while(true) {
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Choose the operator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Main menu");

            System.out.println("Choose the operator");
            int Operation = input.nextInt();

        int result = 0;

        switch (Operation) {
            case 1:
                result = (num1 + num2);
                break;
            case 2:
                result = (num1 - num2);
                break;
            case 3:
                result = (num1 * num2);
                break;
            case 4:
                result = (num1 / num2);
                break;
            case 5:
                System.out.println("Main Menu");
               continue;
            default:
                System.out.println("Invalid Operation Choice");
                continue;

        }
            System.out.println("Calculator result is: " + result);
        }


    }
}
