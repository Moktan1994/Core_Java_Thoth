package BasicJava;

public class JavaSwitch {
    public static void main(String[] args) {
        int day = 9;
        switch (day)
        {
            case 1 :
                System.out.println("sunday");
                break;
            case 2 :
                System.out.println("monday");
                break;
            case 3 :
                System.out.println("tuesday");
                break;
            case 4 :
                System.out.println("wednesday");
                break;
            case 5 :
                System.out.println("thursday");
                break;
            case 6 :
                System.out.println("friday");
            case 7 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("Please enter value between 1 to 7");


        }
    }
}
