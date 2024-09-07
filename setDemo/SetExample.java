package setDemo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {

	Set<String> sets = new HashSet<String>();
	
	sets.add("Apple");
	sets.add("Banana");
	sets.add("Papaya");
	sets.add("Mango");
	sets.add("Peach");
	sets.add("Peach");
	
	System.out.println(sets);
	
	for(String fruit : sets) {
		System.out.println(fruit);
	}
	 boolean status = sets.contains("Peach");
	 System.out.println(status);
	
	}
}
