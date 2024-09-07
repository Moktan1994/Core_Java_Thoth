package oops;

class Computer {
	String color = "Silver";
	int price = 1000;
	void music() {
		System.out.println("Play the music");
	}

}
class Samsung extends Computer{
	String camera = "FrontCamera";
	void capture() {
		System.out.println("Capture the vedio");
	}
}

public class ComputerInherit{

	public static void main(String[] args) {
		Computer cm = new Computer();
		cm.music();
		
		System.out.println("\n-------------\n");
		Samsung sm = new Samsung();
		sm.capture();
		sm.music();
		System.out.println("\n-------------\n");
		//the UpCasting 
		Computer cm1 = new Samsung();
		cm1.music();
		System.out.println("\n-------------\n");
		//the DownCasting
		Samsung sm1 = (Samsung)cm1;
		sm1.music();
		sm1.capture();
		System.out.println("\n-------------\n");
		System.out.println("color is "+sm1.color);
		System.out.println("camera is "+sm1.camera);
		System.out.println("price is "+sm1.price);
		
	}

}
