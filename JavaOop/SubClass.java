package JavaOop;

import BasicJava.ClassForTest;

public class SubClass {
    public static void main(String[] args) {

    ObjectClass f1 = new ObjectClass();//import the class from another package.
        f1.todoSub();
        ClassForTest classForTest = new ClassForTest(); //import the class from another package.
        System.out.println(classForTest.weight);
        System.out.println(classForTest.race);
        classForTest.race = "White"; //Modify Attributes
        System.out.println(classForTest.race);
    }
}
