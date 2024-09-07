package String;

public class JavaString {
    public static void main(String[] args) {
        String s1 = "Java"; //with the help of String literals.

        String s2 = new String("Java");//with the help of new keyword.

        System.out.println("s1 " +s1);

        System.out.println("s2 " +s2);

        String s3 = "Java";

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s3 == s2.intern());

        String str1 = "Ronaldo";
        String str2 = "Messi";
        String str3 = "Raju";
        String str4 = new String("Ronaldo");
        String str5 = new String("Messi");
        String str6 = new String("Raju").intern();

        System.out.println(str1 == str4);
        System.out.println(str2 == str5);
        System.out.println(str3 == str6);
    }
}
