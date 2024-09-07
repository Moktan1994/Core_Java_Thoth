package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> salaries = new TreeMap<>();
		salaries.put("John", 2000);
		salaries.put("Mike", 1200);
		salaries.put("Kelly", 500);
		salaries.put("Morgan", 900);
		salaries.put("Bott", 500);
		salaries.put("Morgan",5400);
		salaries.put("Wolve", 500);
		salaries.put("Nike", null);//value is allow for null
		//salaries.put(null, null); key is not allow null
	
		
		System.out.println(salaries);
		
		Set<String> keys = salaries.keySet();
		
		System.out.println("after iterate");
		for (String key:keys) {
			System.out.println("key = "+key+" ,value = "+salaries.get(key));
		}
	}

}
