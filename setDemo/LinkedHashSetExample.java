package setDemo;

import java.util.LinkedHashSet;
import java.util.Set;
//in set>>> hashset and linkedhashset does not maintain order and does not allows duplicates
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> sets = new LinkedHashSet<>();
		sets.add("Toyota");
		sets.add("Honda");
		sets.add("Hyundai");
		sets.add("BMW");
		sets.add("Audi");
		sets.add("Audi");//in set does not allows duplicates
		
		System.out.println(sets);
		
		for(String cars : sets) {
			System.out.println(cars);
		}
		boolean status1 = sets.contains("Audi");
		System.out.println(status1);
		
		boolean status = sets.contains("Mustang");
		System.out.println(status);
	}

}
