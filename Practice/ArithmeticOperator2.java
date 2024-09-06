package Practice;

import java.util.Scanner;

public class ArithmeticOperator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operation\n");
        System.out.println("Enter your first number: ");
        int first = input.nextInt();
        System.out.println("And now Enter your second number");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("addition is  " + add);
        System.out.println("addition is  " + sub);
        System.out.println("addition is  " + mul);
        System.out.println("addition is  " + div);
        System.out.println("addition is  " + mod);
    }
}
