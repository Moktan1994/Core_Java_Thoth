package string;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentance please");
		String line = scan.nextLine();
		System.out.println(line);
		
		String[] token = line.split(" ");
		
		StringBuilder result = new StringBuilder();
		for(int i = 0;i <token.length;i++) {
			String count = token[i];
			String output = reserveMyString(count);
			result.append(output+" ");
		}
		System.out.println(result.toString());		
	}

	private static String reserveMyString(String str) {
		int j = str.length();
		String output = "";
		for(int x = 0;x < j;x++) {
		char ch = str.charAt(x);
		output = ch+output;
		}
		return output;
	}
	

}
