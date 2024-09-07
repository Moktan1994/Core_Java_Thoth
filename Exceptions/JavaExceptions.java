package Exceptions;

public class JavaExceptions {
    public static void main(String[] args) {
        int result = multiply(5, 8);
        System.out.println(result);
        try {
            int value1 = 30;
            int value2 = 0;
            int division = value1 / value2;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }

    public static int multiply(int num1, int num2) {
        try {
            return num1 * num2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    }

