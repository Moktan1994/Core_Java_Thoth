package Comparator;

import java.util.ArrayList;

public class ToString {
    public static void main(String[] args) {
        Integer key = 100;
        Double key1 = 300.00;
        ArrayList<String> toString = new ArrayList<String>();
        toString.add(key.toString());
        toString.add(key1.toString());
        toString.add("Rin-zen");
        System.out.println(toString);

    }
}
