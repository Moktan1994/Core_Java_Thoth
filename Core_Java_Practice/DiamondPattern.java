package Practice;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row -i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row - 1; i > 0; i--) {
            for (int j = 1; j <= row -i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
    }
}

}
