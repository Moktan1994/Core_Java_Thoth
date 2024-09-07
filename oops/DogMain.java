package oops;

class Dog {
	String name="tommy";
	int tail=1;
	void dance() {
		System.out.println("Dog is dancing!!");
	}
}
class BarkDog extends Dog{
	String color="white";
	void bark() {
		System.out.println("Dog barks at night");
	}
}
public class DogMain {
	public static void main(String[] args) {
		Dog d =new Dog();
		d.dance();
		
		BarkDog bd =new BarkDog();
		bd.dance();
		bd.bark();
		System.out.println("color= "+bd.color);
		System.out.println("name= "+bd.name);
		System.out.println("tail= "+bd.tail);
		
	}
}