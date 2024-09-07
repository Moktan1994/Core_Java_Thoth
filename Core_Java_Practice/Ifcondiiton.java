package Practice;

class Ifelse {
    public static void main(String[] args) {
        int value1 = 170;
        int value2 = 160;

        if (value1 <=  value2) {
            System.out.println("Equal and less");
        }
        if (value1 == value2) {
            System.out.println("Equal");
        }
        if (value1 > value2) {
            System.out.println("Greater");
        }
        if (value1 >= value2) {
            System.out.println("Greater and equal");
        }
        if (value1 < value2) {
            System.out.println("Lesser");
        }
        else {
            System.out.println("NOT Equal");
        }
    }
}
