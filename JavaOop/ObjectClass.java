package JavaOop;

public class ObjectClass {
    int weight = 63;
    String race = "Asian";
    public static void main(String[] args) {



    }
    public void todoSum()
    {
        ObjectClass objectClass = new ObjectClass();
        System.out.println(ObjectClass.sum(40,45));
    }
    public void todoSub()
    {
        ObjectClass objectClass = new ObjectClass();
        System.out.println(ObjectClass.sub(60,45));
    }
    public static int sum(int number1, int number2) {
        return number1+number2;
    }
    public static int sub(int number1, int number2) {
        return number1-number2;
}
}
