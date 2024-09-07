package BasicJava;

public class JavaLoops {
    public static void main(String[] args) {
        //while condition
        int j = 0;
        {
            while (j <= 10) {
                System.out.println(j);
                j++;
            }
        }

        //for loop condition
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //Nested loop condition
        for (int k = 1; k <= 6; k++) {
            for (int repK = 1; repK <= 6; repK++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
