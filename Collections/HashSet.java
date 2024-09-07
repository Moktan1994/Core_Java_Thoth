package Collections;

import java.util.ArrayList;

public class HashSet {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Kia");
        System.out.println(cars);
        System.out.println(cars.size());

        System.out.println("----------------------");

        java.util.HashSet<String> gadi = new java.util.HashSet<String>();
        gadi.add("Honda");
        gadi.add("Toyota");
        gadi.add("Mazda");
        gadi.add("Honda");
        gadi.add("Kia");
        System.out.println(gadi);
        System.out.println(gadi.size());

    }
}
