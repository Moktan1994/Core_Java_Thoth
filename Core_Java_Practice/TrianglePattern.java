package Practice;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number for triangle pattern:");
        int pattern = input.nextInt();
        int loop = 0;

        while (loop <= pattern) {
            for (int i = 1; i <= loop; i++) {
                System.out.print(i);
        }
            System.out.println();
            loop++;

        }
    }
}
