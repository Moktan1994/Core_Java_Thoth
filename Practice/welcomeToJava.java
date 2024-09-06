package Practice;

import java.util.Scanner;

public class welcomeToJava {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Welcome " + name + " to the Java World");
    }
}