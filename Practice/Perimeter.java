package Practice;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter of  a rectangle");
        System.out.println("Enter your all four side of perimeter in cms: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a + b + c + d;
        System.out.println("Your perimeter of rectangle is " + perimeter +"cm");

        }
}
