package string;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence please");
		String input = scan.nextLine();

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			//char ch = input.charAt(i);
			if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				System.out.println("Vowel found " + input.charAt(i));
			}
		}
	}

}
