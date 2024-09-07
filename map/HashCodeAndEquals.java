package map;
import java.util.*;
class Car {
	private String name;
	private String color;
	private int wheel;
	public Car(String name, String color, int wheel) {
		super();
		this.name = name;
		this.color = color;
		this.wheel = wheel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, name, wheel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && wheel == other.wheel;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", wheel=" + wheel + "]";
	}
	
}

public class HashCodeAndEquals {

	public static void main(String[] args) {
		Set<Car> car = new HashSet<>();
		Car c1 = new Car("Toyota", "Red", 4);
		Car c2 = new Car("Honda","White",6);
		Car c3 = new Car("Tesla","Black",5);
		Car c4 = new Car("Toyota","Red",4);
		//Checking the hashcode number here
		System.out.println("c1.hashCode() = "+c1.hashCode());
		System.out.println("c4.hashCode() = "+c4.hashCode());
		car.add(c4);
		car.add(c2);
		car.add(c3);
		car.add(c1);
		System.out.println(car);
	
	}

}
