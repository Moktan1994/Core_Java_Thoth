package oops;

public class Fox {
	String name;
	double price;

	// name is same as class
	// no return type
	// method
	// constructor
	Fox(String n, double p) {
		name = n;
		price = p;
	}

	void jump() {
		System.out.println("fox jumps over stone!!");
	}

	// void means when this method is called it will not return anything back
	void info() {
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}

	public static void main(String[] args) {
		Fox d1 = new Fox("jenny", 100);
		Fox d2 = new Fox("kenny", 50);
		d1.jump();
		d1.info();
		d2.jump();
		d2.info();
	}
}
