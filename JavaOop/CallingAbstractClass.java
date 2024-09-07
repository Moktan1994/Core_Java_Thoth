package JavaOop;

public class CallingAbstractClass extends AbstractClass{
    public static void main(String[] args) {
        CallingAbstractClass cac = new CallingAbstractClass();
        cac.carEngine();
        cac.useMyName();
        cac.useOnlyMyName();
        cac.createEngine();

    }

    @Override
    public void useOnlyMyName() {
        System.out.println("This engine is belongs to Only Abstract Class");
    }

    @Override
    public void createEngine() {
        System.out.println("The engine ia a 30 HP");
    }
}
