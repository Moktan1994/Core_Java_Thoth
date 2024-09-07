package Collections;

import java.util.ArrayList;

public class ListOfExample {
    public static void main(String[] args) {

        ArrayList<Integer> ite = new ArrayList<Integer>();
        ite.add(8);
        ite.add(30);
        ite.add(27);
        ite.add(76);
        ite.add(59);
        ite.add(46);
        ite.add(41);
        ite.add(18);
        System.out.println(ite);
        ite.set(4, 15);
        System.out.println(ite);
        ite.remove(6);
        System.out.println(ite);

        for (int i : ite) {
            System.out.println(i);
        }
        int i = 0;
        for (i = 0; i < ite.size(); i++) {
            System.out.println(i);
        }
        }
    }

