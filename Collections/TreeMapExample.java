package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //hashmap is randomly print
        System.out.println("HashMap is randomly print");
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("K", "Kevin");
        hashMap.put("H", "Henry");
        hashMap.put("Z", "Zebra");
        hashMap.put("A", "Alok");
        for (String i : hashMap.keySet()) {
            System.out.println("Key: " + i + ",Value:" + hashMap.get(i));
        }
        //linkedHashmap is follow the insertion order means who come first that is first print
        System.out.println("LinkedHashMap is follow insertion order print");
        Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("K", "Kevin");
        linkedHashMap.put("H", "Henry");
        linkedHashMap.put("Z", "Zebra");
        linkedHashMap.put("A", "Alok");
        for (String i : linkedHashMap.keySet()) {
            System.out.println("Key: " + i + ",Value:" + linkedHashMap.get(i));
        }
        //treemap is follow the sorting order
        System.out.println("TreeMap is follow sorting order print");
        Map<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("K", "Kevin");
        treeMap.put("H", "Henry");
        treeMap.put("Z", "Zebra");
        treeMap.put("A", "Alok");
        for (String i : treeMap.keySet()) {
            System.out.println("Key: " + i + ",Value:" + treeMap.get(i));
        }
    }
}
