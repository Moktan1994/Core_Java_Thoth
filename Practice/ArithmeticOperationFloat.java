package Practice;

import java.util.Scanner;

public class ArithmeticOperationFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Use Float number");
        System.out.println("Enter your first number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter your second number");
        float num2 = input.nextFloat();

        float product = num1 * num2;
        System.out.println("\n Our product result is " +product);
    }
}
