package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class listOfSorting {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1000);
        list.add(500);
        list.add(780);
        list.add(500);
        list.add(250);
        list.add(450);
        System.out.println(list);
        System.out.println("The list is print in sorting list");
        Collections.sort(list);
        System.out.println(list);
        //for loop using calculate to total sum
        Integer totalSum = 0;
        for (int i = 0; i < list.size(); i++) {
            totalSum = totalSum + list.get(i);
        }
        System.out.println("TotalSum = "+totalSum);
    }
}
