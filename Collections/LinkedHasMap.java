package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap {
    public static void main(String[] args) {
        //create a HashMap object called people
       /* HashMap<String, Integer> people = new HashMap<String, Integer>();
        //Add keys and values (Name,Age)
        people.put("Raju", 30);
        people.put("Usha", 22);
        people.put("Nisha", 20);
        people.put("Rin-zen", 2);
        people.put("Rup-esh", 20);

        //using for loop through a hashmap
        for (String i : people.keySet()) {
            System.out.println("Key: " + i + ",Value:" + people.get(i));*/
            LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
            lhm.put(100,"Raju");
            lhm.put(101,"Usha");
            lhm.put(102,"Nisha");
            lhm.put(103,"Rin-zen");
            lhm.put(104,"Rup-esh");

            //fetching key
            System.out.println("keys : "+lhm.keySet());

            //fetching value
            System.out.println("value : "+lhm.values());

            //fetching key-value pair
        System.out.println("key-value pairs : "+ lhm.entrySet());
        }
    }

