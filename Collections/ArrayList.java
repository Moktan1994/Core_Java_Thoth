package Collections;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Grape");
        System.out.println(fruits.size());//Get an Item size.
        fruits.remove(4);//Remove an Item.
        System.out.println(fruits.set(3,"Fig"));//Replace an Item.
        System.out.println(fruits);//print the all an Item.
        System.out.println(fruits.size());//Get an Item size.
        System.out.println(fruits.get(3));//Access an Item.

        //Loop Through an ArrayList
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        //Loop through an ArrayList with the for-each loop
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Grape");
        for (String i : fruits) {
            System.out.println(i);

        }


    }
}

