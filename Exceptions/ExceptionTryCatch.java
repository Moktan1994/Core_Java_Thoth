package Exceptions;

public class ExceptionTryCatch {
    public static void main(String[] args) {
        int result = division(80, 0);
        System.out.println(result);
    }

    public static int division(int number1, int number2) {
        try {
            return number1 / number2;
        }
        catch (ArithmeticException e) {
        System.out.println("Something went wrong");
        e.printStackTrace();
        }
        return 0;
    }
}
