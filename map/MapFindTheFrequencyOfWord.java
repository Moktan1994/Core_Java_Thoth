package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapFindTheFrequencyOfWord {
	
	public static void main(String[] args) {
		System.out.println("Enter your sentance");
		String input = new Scanner(System.in).nextLine();
		
		String tokens[] = input.split(" ");
		Map<String,Integer> map = new HashMap<>();
		
		for(String token : tokens) {
			//map.put(token, map.getOrDefault(token,0)+1);
			if(map.containsKey(token)) {
				int currentCount = map.get(token);
				map.put(token, currentCount+1);
			}else {
				map.put(token,1);
			}
		}
		System.out.println(map);
	}

}
