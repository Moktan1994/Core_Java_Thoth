package queue;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {


	//List  = ArrayList
	//Set - HashSet
	//Map - HashMap
	public static void main(String[] args) {
		
		Map<String,Integer> salaries=new TreeMap<>();
		salaries.put("nagen", 1000);
		salaries.put("namita", 400);
		salaries.put("mario", 2000);
		salaries.put("mario", null);
		//salaries.put(null, 10);
		//salaries.put(null, 3);
		Set<String> keys=salaries.keySet();
		
		for(String key : keys) {
			System.out.println("key = "+key+" , value = "+salaries.get(key));
		}
	}
}
