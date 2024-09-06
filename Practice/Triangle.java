package Practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator");
        System.out.println("Enter your base in cms: ");
        double base = input.nextDouble();
        System.out.println("Now, please enter your perpendicular in cms: ");
        double height = input.nextDouble();

        double area = 0.5* base * height;
        System.out.println("Your area of triangle is: " + area +"cm2");
    }
}
