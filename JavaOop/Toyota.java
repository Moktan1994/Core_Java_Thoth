package JavaOop;

public class Toyota extends Car {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.carHorn();
        toyota.carBrake();
        toyota.carColor();
        toyota.carCam();
    }
    public void CorollaHybrid() {
        System.out.println("Hybrid is Great");
    }
    //public void carCam() {
      //  System.out.println("Camera is both side and back camera is 360 view");
    //}
}
