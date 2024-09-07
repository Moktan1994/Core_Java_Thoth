package oops;


public class Car {
	int weight = 5000;
	String color = "Black";
	
	 void run() {
		 System.out.println("Car is too fast");
		
	 }
	 public void horn() {
		 System.out.println("Horn sound is tee tee");
	 }
	 public static void main(String[] args) {
		Car c1 = new Car();
		c1.run();
		c1.horn();
		
	}

}
