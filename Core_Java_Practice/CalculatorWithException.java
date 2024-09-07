package Practice;

import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int firstNum = input.nextInt();
        System.out.println("Enter your Arithmetic operator -,+,*,/");
        int operator = input.nextInt();
        System.out.println("Enter your second number ");
        int secondNum = input.nextInt();

    }
    public static int sum(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

}
