package Practice;

import java.util.Scanner;

public class Add4 {
    public static void main(String[] args) {
        System.out.println("Please Enter your number");
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            System.out.println("Total sum is" + sum);
        }
        catch (ArithmeticException e) {
            System.out.println("you did something wrong");
            e.printStackTrace();
        }
    }
}