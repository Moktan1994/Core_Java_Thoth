package samsung;

import apple.Iphone14;
import apple.Iphone15;

public class GalaxyUltra extends Iphone14 {
	public static void main(String[] args) {
		Iphone14 i14 = new Iphone14();//calling protected access modifier here
		//i14.sound();we cannot call the protected method from another package
	}

}

