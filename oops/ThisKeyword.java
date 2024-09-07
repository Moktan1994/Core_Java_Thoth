package oops;//this is a package of project

class Loader {//this is a class and Loader is class name
	String name = "Tommy";//this is attribute of loader class
	
	void info() {//this is a method and info is method name 
		System.out.println("name= "+name);//we are printing a name 
		System.out.println(this);//same value see here
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loader ll = new Loader();
		ll.info();
		System.out.println(ll);//what ever value see here

	}

}
