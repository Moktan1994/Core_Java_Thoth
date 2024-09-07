package string;

public class ReverseWord {

	public static void main(String[] args) {
		String name = "nagen";
		String output ="";
		for(int x=0;x<name.length();x++) {
			char ch = name.charAt(x);
			output = ch+output;
		}
		System.out.println(output);
	}
}
