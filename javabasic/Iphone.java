package javabasic;

import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {

        int a, b , c, sum;

        Scanner agenum = new Scanner(System.in);
        System.out.println("Type a age");
        a = agenum.nextInt();
        System.out.println("Type a another age");
        b = agenum.nextInt();
        System.out.println("Type a last age");
        c = agenum.nextInt();
        sum = a+b+c;
        System.out.println("Sum of total age" + sum);
    }
}
