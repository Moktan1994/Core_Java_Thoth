package string;

public class StringExample {

	public static void main(String[] args) {
	
		String name = "Java";
		String name1 = "Python";
		String name2 = "Java";
		String name3 = new String("Python");
		String name4 = new String("Java");
		
		System.out.println(name1.equals(name3));
		System.out.println(name1==name3);
		System.out.println(name1.equals(name4));
		
		if(name == name2) {
			System.out.println("This is in same memory");
		
		}else {
			System.out.println("This is not in same memory");
		}

	}

}
