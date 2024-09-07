package Practice;

import java.util.Scanner;

public class FourthHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int repeatNum = scanner.nextInt();
        int loop = 0;
        while (loop <= repeatNum) {
            for (int value = 1; value <= loop; value++) {
                System.out.print(loop);
            }
            System.out.println();
            loop++;
        }
    }
}
