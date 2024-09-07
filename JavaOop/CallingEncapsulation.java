package JavaOop;

 public class CallingEncapsulation{
    public static void main(String[] args) {
        EncapsulationFirst ef = new EncapsulationFirst();
        System.out.println(ef.getYear());
        System.out.println(ef.getMonth());

        ef.setYear(1990);
        ef.setMonth("September");
        System.out.println(ef.getYear());
        System.out.println(ef.getMonth());
    }
}
