package BasicJava;

import java.util.Scanner;

public class InputValue {

    public static void main(String[] args) {

        int a, b, c, multiple;

        Scanner b2 = new Scanner(System.in);
        System.out.println("Type a number");
        a = b2.nextInt();
        System.out.println("Type a 2nd number");
        b = b2.nextInt();
        System.out.println("Type a last number");
        c = b2.nextInt();
        multiple = a*b*c;
        System.out.println("Total multiple " + multiple);

    }
}