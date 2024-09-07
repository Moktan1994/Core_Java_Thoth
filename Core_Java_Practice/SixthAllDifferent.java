package Practice;

import java.util.Scanner;

public class SixthAllDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int firstNUm = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter your third number: ");
        int thirdNum = scanner.nextInt();

        if (firstNUm == secondNum && firstNUm == thirdNum && secondNum == thirdNum) {
            System.out.println("All number are equal");
        }
        else if (firstNUm != secondNum && firstNUm != thirdNum && secondNum != thirdNum) {
            System.out.println("All number are different");
        }
        else {
            System.out.println("Neither all number are equal or different");
        }

    }
}
