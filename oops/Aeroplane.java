package oops;
class FlyEmirates {
	String color = "white";
	int engine = 5;
	void window () {
		System.out.println("we can see from window");
	}
}
class  QatarAirways extends FlyEmirates {
	String light = "Headlight";
	void fly () {
		System.out.println("QatarAirways Can fly");
	}
	
}

public class Aeroplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyEmirates fe = new FlyEmirates();
		fe.window();
		//fe.fly(); //you can't call the fly method 
		System.out.println("\n--------------\n");
		QatarAirways qa = new QatarAirways();
		qa.fly();//here we can call the the both method because we used the extends keyword
		qa.window();
		
		System.out.println("\n--------------\n");
		
		//the UpCasting
		FlyEmirates fef = new FlyEmirates();
		fef = new QatarAirways();
		fef.window();
		System.out.println("\n--------------\n");
		//the DownCasting
		QatarAirways qaq = (QatarAirways)fef;
		qaq.fly();
		qaq.window();
		System.out.println("\n--------------\n");
		System.out.println(qaq.color);
		System.out.println(qaq.engine);
		System.out.println(qaq.light);
		
	}

}
