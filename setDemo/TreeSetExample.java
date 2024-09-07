package setDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> sets = new TreeSet<>();
		sets.add("Aldi");
		sets.add("Giant");
		sets.add("Amazon");
		sets.add("BJ's");
		sets.add("Walmart");
		sets.add("Aldi");
		sets.add("Staples");
		
		System.out.println(sets);
		
		System.out.println("After iterate");
		for(String stores : sets) {
			System.out.println(stores);
		}
		int total = sets.size();
		System.out.println(total);
	}

}
