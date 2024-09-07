package BasicJava;

public class JavaArray {
    public static void main(String[] args) {
        String[] cars = {"Acura", "BMW", "Honda", "Toyota"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[3]);
        System.out.println(myNum[0]);

        cars[3] = "Tata";
        System.out.println(cars[3]);

        //System.out.println(cars.length);

        for (int num = 0; num < cars.length; num++) {
        if (num == 1)
            System.out.println(cars[num]);
        }
    }
}
