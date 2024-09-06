package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.print("Plese enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Now enter the second number: ");
        int number2 = input.nextInt();
        int Sum = number1+number2;
        System.out.println("Sum of your numbers: " + Sum);

    }
}
