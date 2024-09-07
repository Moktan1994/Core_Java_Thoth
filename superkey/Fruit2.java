package superkey;

public class Fruit2 extends Fruit {
	String name = "banana";
	@Override
	public void eat() {
		System.out.println("I eat alot of "+name+" fruit.");
	}
	public void sweet() {
		String name ="kiwi";
		System.out.println(name+" is good for health.");
	}
	public void info() {
		Fruit2.super.eat();
		Fruit2.this.eat();
		
		Fruit2.this.sweet();
	}

}
