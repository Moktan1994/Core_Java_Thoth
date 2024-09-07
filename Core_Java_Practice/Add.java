package Practice;

import java.util.Scanner;

public class Add {
    public static void main(String args[]) {

        System.out.println("Enter num");
        //System.in  ->> reference to the keyboard
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt(); //hey give me int value which is entered by the keyboard

        //HEY DO YOU WANT TO TAKE INPUT FROM KEYWORD??? YES YES
        //int num = 1234;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10; // 5 , 4 ,3 ,2, 1
            sum = sum + rem; // 0 +5
            num = num / 10; // 1234 ->>123 -> 12 -> 1 -> 0
        }
        System.out.println("sum = " + sum);
    }
}

