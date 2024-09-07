package Practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to practice session");
        System.out.print("How much you pay for rent: ");
        int rent = input.nextInt();
        System.out.println("That's a cheap rate");
        System.out.print("And How much you pay: ");
        int rent1 = input.nextInt();
        System.out.println("Is your apartment good facilities?");
        String facilities = input.next();
        System.out.println("Yes my apartment facilities " + facilities);
    }
}
