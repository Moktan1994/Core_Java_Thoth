package map;

import java.util.*;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		//LinkedHashMap maintain an insertion order
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Toyota", null);
		map.put(null, 500);
		map.put("Honda", null);
		map.put("BMW", null);
		// Does not add if "Acura" is already in the map
		map.putIfAbsent("Toyota", 2700);
		
		System.out.println(map);
		// Copies all entries from 'map' to 'newMap'
		//HashMap does not maintain an insertion order
		Map<String,Integer> newMap = new HashMap<>();
		newMap.putAll(map);
		System.out.println(newMap);
	}

}
