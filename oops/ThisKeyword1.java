package oops;

class Mobile {
	String brand;
	int price;
	
	Mobile(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		int price = 550;
		System.out.println("brand ="+brand);
		System.out.println("brand ="+this.brand);
		System.out.println("price ="+price);
		System.out.println("price ="+this.price);
	}
}

public class ThisKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb = new Mobile("Iphone",1200);
		mb.print();
		

	}

}
