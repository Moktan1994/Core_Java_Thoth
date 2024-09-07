package string;

import java.util.Scanner;

public class ReverseSentence2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("where are you from?");
		String answer = scan.nextLine();
		System.out.println(answer);
		String[] broken = answer.split(" ");
		
		StringBuilder result = new StringBuilder();
		for(int i=0;i<broken.length;i++) {
			String count = broken[i];
			String output = reverseMyString(count);
			result.append(output+" ");
		}
		System.out.println(result.toString());
		
	}

	private static String reverseMyString(String count) {
		int j = count.length();
		String output = "";
		for(int x=0;x<j;x++) {
			char ch = count.charAt(x);
			output = ch+output;
		}
		return output;
	}

}
