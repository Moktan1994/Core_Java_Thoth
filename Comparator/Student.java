package Comparator;

public class Student {
    int rollNum;
    String name, address;

    //create a constructor
    public Student(int rollNum,String name,String address) {
        //this keyword refers to current constance itself
        this.rollNum = rollNum;
        this.name = name;
        this.address = address;
    }
    public String toString() {
        //returning attributes of student
        return this.rollNum+" "+this.name+" "+this.address;
    }

}
