package Practice;

import java.util.Scanner;

public class Cube2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter display of the odd natural number: ");
        int sum = input.nextInt();
        for (int i = 1;i <= sum; i++) {
            System.out.println("The Odd of natural number is:" + i*i*i);
        }
    }
}
