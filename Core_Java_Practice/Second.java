package Practice;

import java.util.Scanner;

public class Second {
    static int odd = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your display the sum of natural number: ");
        int counter = input.nextInt();
        int sum = 0;
        while (counter > 0) {
            System.out.println(odd);
            sum = sum + odd;
            odd = odd +2;
            counter--;
        }
        System.out.println("The sum of natural number is: " +sum);
    }
}
