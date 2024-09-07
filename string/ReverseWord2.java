package string;

public class ReverseWord2 {

	public static void main(String[] args) {
		String name = "nagen";
		String output = "";
		int n = name.length();
		for (int x = n - 1; x >= 0; x--) {
			char ch = name.charAt(x);
			output = ch + output;
		}
		System.out.println(output);
	}
}
