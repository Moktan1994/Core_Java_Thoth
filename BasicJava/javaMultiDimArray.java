package BasicJava;

public class javaMultiDimArray {
    public static void main(String[] args) {
        String[][] students = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}};
        System.out.println(students[1][3]);

        students[1][3] = "Rin-zen";
        System.out.println(students[1][3]);

        for (int i = 0; i < students.length; ++i) {
            int j;
            for (j = 0; j < students[i].length; ++j) {
            }
            System.out.println(students[i][j]);
        }
    }
}
