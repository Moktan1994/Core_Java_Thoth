package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachWord {
	
	public static void main(String[] args) {
		System.out.println("Enter your word please");
		String input = new Scanner(System.in).nextLine();
		
		String token[] = input.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String tokens : token) {
			//default method map
			//map.put(tokens,map.getOrDefault(tokens,0)+1);
			if(map.containsKey(tokens)) {
				int currentCount = map.get(tokens);
				map.put(tokens,currentCount+1);
			}else {
				map.put(tokens, 1);
			}
		}
		System.out.println(map);
	}

}
