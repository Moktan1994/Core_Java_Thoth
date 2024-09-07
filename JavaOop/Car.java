package JavaOop;

public class Car extends Inheritance {//inheritance is superclass and car is subclass.

    public static void main(String[] args) {
        Car car = new Car();
        car.carBrake();
        car.carHorn();
    }
    public void carColor() {
        System.out.println("Color should be Blue");
    }
    public void carCam() {
        System.out.println("Camera is 360 view");
    }
    public void carHorn() {
        System.out.println("Pee,Pee");
    }
}

