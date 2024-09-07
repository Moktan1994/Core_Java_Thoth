package Exceptions;

public class ArrayException {
    static String color;
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Cherry"};
        color = "White";
        try {
            System.out.println("Value of 2 " + fruits[10]);
            System.out.println(10/2);
            System.out.println(color.length());
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Something wrong");
            ae.printStackTrace();
        }
        catch (ArithmeticException ea) {
            System.out.println("Division value is mistake");
            ea.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("color value length is not available");
            e.printStackTrace();
        }
        System.out.println("Value of 0 " +fruits[0]);
        System.out.println("Value of 1 " +fruits[1]);
    }
}
