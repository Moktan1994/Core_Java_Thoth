package BasicJava;

public class Operators {
    public static void main(String[] args) {

        int myInt = 55;

        System.out.println(++myInt);
        System.out.println(myInt++);
        System.out.println(myInt);
        System.out.println(--myInt);
        System.out.println(myInt--);
        System.out.println(myInt);

        myInt += 5;
        //same result.
        // myInt = myInt +5;
        System.out.println(myInt);

        myInt -= 10;
        System.out.println(myInt);

        myInt *= 3;
        System.out.println(myInt);

        myInt /= 15;
        System.out.println(myInt);

        myInt %= 4;
        System.out.println(myInt);


    }
}
