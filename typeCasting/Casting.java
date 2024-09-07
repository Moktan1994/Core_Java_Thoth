package typeCasting;

public class Casting {

	public static void main(String[] args) {
		short num1 = 50;
		short num2 = 40;
		/*short result = num1+num2;//this is error while compiling because when two short value added its automatically
		change into integer value*/
		short result = (short)(num1+num2);
		System.out.println("The result is "+result+", and this value convert short into integer");

	}

}
