package JavaOop;

public class CallingInterface implements FirstInterface,SecondInterface {
    public static void main(String[] args) {
        CallingInterface ci = new CallingInterface();

        ci.createEngine();
        ci.createBrake();
        ci.createHorn();
        ci.sunRoof();
    }
    public void createEngine() {
        System.out.println("New Engine");
    }
    public void createBrake() {
        System.out.println("Super Brake");
    }
    public void createHorn() {
        System.out.println("Horn is Great");
    }
    public void sunRoof() {
        System.out.println("sun roof is awesome");
    }
}
