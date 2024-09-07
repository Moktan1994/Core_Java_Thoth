package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String[] args) {

    //creating an empty arraylist of student type
    ArrayList<Student> listOfStudent = new ArrayList<Student>();
    //adding entries in above list.
    //using add method
        listOfStudent.add(new Student(423,"Henry","South Africa"));
        listOfStudent.add(new Student(213,"Mike","Usa"));
        listOfStudent.add(new Student(111,"Victor","Colombia"));
        listOfStudent.add(new Student(222,"Santa","Nepal"));

        //Display message in console for better readability
        System.out.println("Unsorted list");

        //Iterating over entries to print them
        for (int i = 0; i < listOfStudent.size(); i++) {
            System.out.println(listOfStudent.get(i));
        }

        //Sorting student entries by rollNumber
        Collections.sort(listOfStudent,new SortByRollNum());

        //Display message in console for better readability
        System.out.println("\nsorted list");

        //Again Iterating over entries to print them
        for (int i = 0; i < listOfStudent.size(); i++) {
            System.out.println(listOfStudent.get(i));
       }
        //sorting student entries by name
        Collections.sort(listOfStudent,new SortByName());

        //Display message in console for better readability
        System.out.println("\nsorted list");

        ////Again Iterating over entries to print them
        for (int i = 0; i < listOfStudent.size(); i++) {
            System.out.println(listOfStudent.get(i));
        }
    }
}
