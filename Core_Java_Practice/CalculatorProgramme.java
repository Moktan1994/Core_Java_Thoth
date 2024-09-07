package Practice;

public class CalculatorProgramme {
    public static void main(String[] args) {
        System.out.println("Hello Team");
        menu();
        int actionValue = 3;
        int result = 0;

        if (actionValue ==1) {
            result = sum(25, 35);
        }
        if (actionValue ==2) {
            result = Subtraction(50,35);
        }
        if (actionValue ==3) {
            result = Multiply(13,5);
        }
        if (actionValue ==4) {
            result  = divide(60,30);
        }
        if (actionValue ==5) {
            menu();
        }
        if (actionValue == 6) {
        }
        System.out.println(result);
    }
    public static void menu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. want another option");
        System.out.println("6. Exit");


    }
    public static int sum(int number1 , int number2)
    {
        return number1 + number2;
    }
    public static int Subtraction(int number1 , int number2)
    {
        return number1 - number2;
    }
    public static int Multiply(int number1 , int number2)
    {
        return number1 * number2;
    }
    public static int divide(int number1 , int number2)
    {
        return number1 / number2;
    }
}
