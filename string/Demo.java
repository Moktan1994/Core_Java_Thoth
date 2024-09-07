package string;

public class Demo {
	public static void main(String[] args) {
		String name = "Hemanta";
		String cast = "Tamang";
		System.out.println("Hello "+name+" "+cast+".");
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(cast.toUpperCase());
		System.out.println(cast.toLowerCase());
		System.out.println(name.charAt(5));
		System.out.println(cast.length());
		for(int i=0;i<cast.length();i++) {
			char ch = cast.charAt(i);
			System.out.println(ch);
		}
		
	}

}
