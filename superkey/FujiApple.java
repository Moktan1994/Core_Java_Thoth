package superkey;

public class FujiApple extends Apple{
	String color = "Pink";
	 void FujiApple() {
		System.out.println("Fujiapple color is "+color);
	}
	void teste() {
		System.out.println("Fujiapple teste is great");
	}
	void info() {
		teste();
		FujiApple();
		this.teste();
		this.FujiApple();
		super.Apple();
		super.teste();
	}

}
