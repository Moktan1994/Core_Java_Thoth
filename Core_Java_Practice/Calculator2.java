package Practice;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Programme");
        menu();
        int actionValue = 3;
        int result = 0;
        if (actionValue == 1)
        {
            result = sum(60, 20, 20);
        }
        if (actionValue == 2) {
            result = sub(150,90);
        }
        if (actionValue == 3) {
            result = multi(25,3);
        }
        if (actionValue == 4) {
            result = div(1000,50);
        }
        System.out.println("The result is " + result);
    }
    public static void menu() {
        System.out.println("1.Add");
        System.out.println("2.sub");
        System.out.println("3.multi");
        System.out.println("4.div");
        System.out.println("5.Again in menu");
        System.out.println("6.Exit");
    }
    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
    public static int sub(int value1, int value2) {
        return value1 - value2;
    }
    public static int multi(int value1, int value2) {
        return value1 * value2;
    }
    public static int div(int value1, int value2) {
        return value1 / value2;
    }
}
