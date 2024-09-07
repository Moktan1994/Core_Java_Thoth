package Comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    //method
    //sorting in ascending order of rollNum
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

