package Exceptions;

public class FinallyException {
    public static void main(String[] args) {
        int result = 13/1;
        String[] color = {"Red","White","Black"};
        try {
            System.out.println(result);
            System.out.println(color[3]);
        } catch (ArithmeticException ae) {
            System.out.println("There is a problem while divided");
            ae.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ie) {
            System.out.println("Something went wrong");
            ie.printStackTrace();
        } finally {
            try {
                displayName();
            }catch (Exception e) {
                System.out.println("The try-catch is finished");
                e.printStackTrace();
            }
        }
    }
    public static void displayName() {
        System.out.println(10/0);
    }
}
