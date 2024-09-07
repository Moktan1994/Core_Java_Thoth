package oops;
class Person {
	int age;
	Person(int age) {
		this.age = age;
		
	}
	void print() {
		System.out.println("age is = "+age);
	}
	void changeAge(int newAge) {
		age = newAge;
	}
}

public class CallingMethod {
	public static void main(String[] args) {
		Person p1 = new Person(90);
		Person p2 = new Person(80);
		Person p3 = new Person(70);
		p1.print();
		p2.print();
		p3.print();
		p3.changeAge(50);
		p2.changeAge(40);
		p1.changeAge(30);
		p1.print();
		p2.print();
		p3.print();
	}

}
