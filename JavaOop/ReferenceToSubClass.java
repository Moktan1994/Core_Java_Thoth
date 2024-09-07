package JavaOop;

public class ReferenceToSubClass extends Inheritance {
    public static void main(String[] args) {
        Inheritance inh = new Inheritance();
        inh.carBrake();
        inh.carHorn();
        inh.carColor();

        Inheritance in1 = new Car();
        in1.carHorn();
        in1.carColor();

    }
}
