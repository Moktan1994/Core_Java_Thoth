package Practice;

import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.next();
        System.out.println("Hello " +name);
        System.out.print("Enter your first number: ");
        System.out.println("Enter your second number: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println("Enter your operators");
    }

}
