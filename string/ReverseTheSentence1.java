package string;

import java.util.Scanner;

public class ReverseTheSentence1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Plese Enter your sentense");
		String line = scan.nextLine();
		System.out.println(line);
		String[] broken = line.split(" ");
		
		StringBuilder result= new StringBuilder();
		for(int x = 0;x<broken.length;x++) {
			String count = broken[x];
			String output  = reverseMyString(count);
			result.append(output+" ");
			
		}
		System.out.println(result.toString());
	}
	private static String reverseMyString(String str) {
		int n = str.length();
		String output ="";
		for(int x = 0;x<n;x++) {
			char ch = str.charAt(x);
			output = ch+output;
		}
		return output;
	}

}
