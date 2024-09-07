package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        System.out.println(numbers);

        System.out.println("----------------------");

        HashSet<Integer> num = new HashSet<Integer>();
        num.add(4);
        num.add(9);
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        System.out.println(num);

    }
}
