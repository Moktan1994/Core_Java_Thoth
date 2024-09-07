package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHasMap1 {
    public static void main(String[] args) {
        //create a HashMap object called people
        HashMap<String, String> customer = new HashMap<String, String>();
        //Add keys and values (Name,Age)
        customer.put("R1001", "Raju");
        customer.put("U2001", "Usha");
        customer.put("N1021", "Nisha");
        customer.put("R2001", "Rin-zen");
        customer.put("R1010", "Rup-esh");

        //using for loop through a hashmap
        for (String i : customer.keySet()) {
            System.out.println("Key: " + i + ",Value:" + customer.get(i));
            LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        }
        LinkedHashMap<String,String> student = new LinkedHashMap<String,String>();
        //Add keys and values (Name,Age)
        student.put("R1001", "Raju");
        student.put("U2001", "Usha");
        student.put("N1021", "Nisha");
        student.put("R2001", "Rin-zen");
        student.put("R1010", "Rup-esh");

        System.out.println("LinkedHashMap----------");
        //using for loop through a hashmap
        for (String i : student.keySet()) {
            System.out.println("Key: " + i + ",Value:" + student.get(i));
        }
    }
}

