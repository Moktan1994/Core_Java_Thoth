package Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        try {


    JavaExceptions je = null;
    int result = je.subtraction(10,8);
        System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("something wrong while subtraction");
            e.printStackTrace();
        }
     }

}