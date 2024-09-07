package String;

public class StringMethods {
    public static void main(String[] args) {


    String s1 = "Java";
    String s2 = "Python";
    String s3 = "Java is one of the most popular programming language in the world.";
    String s4 = "In Java a string is most important topic.";

    //String Methods in Java.
        //1.int.length()
        System.out.println(s2.length());
        System.out.println(s3.length());

        //2.char charAt(int i)
        System.out.println(s4.charAt(3));
        System.out.println(s3.charAt(10));

        //3.String substring(int i)
        System.out.println(s4.substring(20));
        System.out.println(s3.substring(8));

        //4.String substring(int i.int j)
        System.out.println(s4.substring(20,24));
        System.out.println(s2.substring(2,6));

        //5.String concat(String str)
        String str1 = "Geeks";
        String str2 = "forGeeks";
        System.out.println(str1.concat(str2));
        System.out.println(s1.concat(s2));

        //6.int indexOf(String s1,int i)
        String s = "Learn More Learn";
        System.out.println(s.indexOf("M"));
        System.out.println(s.indexOf("o"));

        //7.int index of (String s, int i)
        System.out.println(s.indexOf("ea", 3));

        //8.int last index of(String s)
        System.out.println(s.lastIndexOf("M"));
        System.out.println(s.lastIndexOf(" "));

        //9.boolean equals (object otherObj)
        String st1 = "geeks";
        String st2 = "Geeks";
        String st3 = "Geeks";
        System.out.println(st1.equals(st2));//false
        System.out.println(st2.equals(st3));//true

        //10.boolean equals IgnoreCase(String another String)
        System.out.println(st1.equalsIgnoreCase(st2));//true
        System.out.println(st2.equalsIgnoreCase(st3));//true

        //11.int compare To(String another String)
        //12.int compare To IgnoreCase(String another String)

        //13.String toLowerCase()
        String word1 = "Hello";
        System.out.println(word1.toLowerCase());

        //14.String toUpperCase()
        System.out.println(word1.toUpperCase());

        //15.String trim()
        String sr = " meet me by the cooler ";
        System.out.println(sr.trim());

        //16.String replace(char old char, char new char)
        System.out.println(sr.replace("cooler","produce"));

        //17.boolean contains(String)
        String sr1 = "Java is good for me";
        System.out.println(sr1.contains("Good"));//returns false
        System.out.println(sr1.contains("good"));//returns true

        //18.char[] toCharArray()
        String sr2 = "betterLife.";
        System.out.println(sr2.toCharArray());
        System.out.println(s1.toCharArray());

        //19.boolean startsWith(String)
        String ss1 = "GeeksForGeeks";
        String ss2 = "Geeks";
        String ss3 = "For";
        System.out.println(ss1.startsWith(ss2));
        System.out.println(ss1.startsWith(ss3));

        //20.boolean isBlank()
        String ss4 = "";
        System.out.println(ss4.isBlank());
    }
}
