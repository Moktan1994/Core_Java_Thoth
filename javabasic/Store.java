package javabasic;

public class Store extends InheritancePractice{
    public static void main(String[] args) {
        InheritancePractice ip = new InheritancePractice();
        ip.produce();
        ip.freshMeat();
    }

    @Override
    public void freshMeat() {
        super.freshMeat();
    }
}
