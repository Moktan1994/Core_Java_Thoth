package Practice;

import java.util.Scanner;

public class CubePractice {
    public static void main(String[] args) {
        Scanner cube = new Scanner(System.in);
        System.out.print("Please Enter your cube number: ");
        int counter = cube.nextInt();

        int number = 1;

        while (number != counter+1) {
            System.out.println("Number is: " + number + " and cube of " + number + " is: " + number * number * number);
            number++;
        }
    }
}
