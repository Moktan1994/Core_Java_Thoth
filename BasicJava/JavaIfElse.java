package BasicJava;

public class JavaIfElse {
    public static void main(String[] args) {
        String name = "Milan";
        int age = 32;

        if (name == "Manoj" || age == 32) {
            System.out.println("Please give money to Manoj.");
        }
        else if (name == "Binod" && age == 32) {
            System.out.println("Please give money to Binod");
        }
        else
        {
            System.out.println("Please don't give money to other person ");
        }
    }
}
