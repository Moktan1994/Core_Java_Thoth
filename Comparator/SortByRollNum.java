package Comparator;

import java.util.Comparator;

public class SortByRollNum implements Comparator<Student> {
    //method
    //sorting in ascending order of rollNum
    public int compare(Student a, Student b) {
        return a.rollNum - b.rollNum;
    }
}
