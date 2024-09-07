package Practice;

import java.util.Scanner;

public class Add2 {
    public static void main(String args[]) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num>0) {
            int rem=num%10;
            sum = sum + rem;
            num  = num/10;
        }
        System.out.println(sum);
    }
}

