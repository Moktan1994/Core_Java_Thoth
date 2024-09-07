package JavaOop;

public class JavaConstructor {
    String color;
    float length;
    public JavaConstructor()
    {
        color = "Black";
        length = 3.33f;
    }

    public static void main(String[] args) {
        JavaConstructor javaConstructor = new JavaConstructor();
        System.out.println(javaConstructor.color);
        System.out.println(javaConstructor.length);
    }
}
