package BasicJava;

public class JavaClassOther {
    public static void main(String[] args) {
        //We can also create an object of a class and access it in another class.
        JavaClassOop javaClassOop = new JavaClassOop();
        System.out.println(javaClassOop.nameColor);

        int sum = javaClassOop.sum();
        System.out.println(javaClassOop.sum());
        System.out.println(sum);

        javaClassOop.nameColor = "Hello OOP";
        System.out.println(javaClassOop.nameColor);
    }

}
