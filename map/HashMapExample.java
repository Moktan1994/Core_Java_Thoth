package map;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> fruits = new HashMap<>();
		
		/*4. Types of Maps
		HashMap: This implementation does not maintain any order of the elements.
		LinkedHashMap: This implementation maintains the insertion order.
		TreeMap: This implementation maintains a sorted order of the keys based on their natural ordering or a specified comparator.
		
		5. Choosing a Map Implementation
		Use HashMap when you need a fast, unordered map.
		Use LinkedHashMap if you need to maintain insertion order.
		Use TreeMap if you need a sorted map.
		
		6. Handling Null Keys and Values
		HashMap and LinkedHashMap allow one null key and multiple null values.
		TreeMap does not allow null keys but allows multiple null values.
		This should give you a solid starting point for working with Map in Java!
		*/
		fruits.put("Apple", null);
		fruits.put("Orange", 5);
		fruits.put("Mango", 5);
		fruits.put("Papaya", 7);
		fruits.put("Cherry", 100);
		
		//Removing an element
		fruits.remove("Papaya");
		fruits.put("Papaya",60);
		
		//Checking if key is exists
		if(fruits.containsKey("Avacado")) {
			System.out.println("Orange is present");
		}else {
			System.out.println("This key is not present");
		}
		//Retrieving a value
		System.out.println("Retrieving a value of Cherry: "+fruits.get("Cherry"));
		
		//printing the map
		//System.out.println(fruits);
		//Iterate in Map syntax
		// Iterating through the Map
		for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println("----------");
		//after iterate printing the map
		Set<String> key = fruits.keySet();
		for(String fruit : key) {
		System.out.println("key = "+fruit+" , value = "+fruits.get(fruit));
		}
	}
}
