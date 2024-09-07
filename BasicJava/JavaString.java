package BasicJava;

import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        //for to Lowercase print the value
        System.out.println(text.toLowerCase());

        //for to Uppercase print the value
        System.out.println(text.toUpperCase());

        //finding a character in a string
        System.out.println(text.indexOf("Wor"));

        //string concatenation
        String data0 = "Apple";
        String data1 = "Cherry";
        System.out.println(data0 + data1);
        System.out.println(data0 +" and "+data1);

        //same concatenation method
        System.out.println(data0.concat(data1));

        //Adding Numbers and Strings
        String name = "My name is Rinzen and My father name is Raju";
        String number = "And My birth year is 2023";
         int number1 = 07;
        System.out.println(name + number);
        System.out.println(number + number1);

        //Java string replace() method
        System.out.println(name.replace("My","Your"));

        //if only first "My" string replace in this method
        System.out.println(name.replaceFirst("My","Your"));


    }
}
