package JavaOop;

public class Constructor {
    static int weight;
    static String name;

    Constructor () {
        weight = 50;
        name = "Nisha";
    }
    Constructor(int weightValue,String nameValue) {
        weight = weightValue;
      name = nameValue;
    }

    public static void main(String[] args) {

        Constructor con1 = new Constructor();
        System.out.println(name);
        System.out.println(weight);

        Constructor con2 = new Constructor(60, "Usha");
        System.out.println(con2.name);
        System.out.println(con2.weight);

    }
}
