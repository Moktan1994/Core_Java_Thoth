package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(40);
        ll.add(7);
        ll.add(90);
        ll.add(50);
        ll.add(0);
        ll.remove(5);
        ll.set(3,0);

        System.out.println(ll.size());
        System.out.println(ll);

        System.out.println("iteration");
        System.out.println("------------");
        System.out.println("foreach loop print");
        System.out.println("------------");
        for (Integer ss:ll) {
            System.out.println(ss);
        }
        System.out.println("------------------");
        System.out.println("for loop print one by one");
        System.out.println("------------------");
        for (int i = 0;i < ll.size();i++) {
            System.out.println(ll.get(i));
        }
        System.out.println("The loop End");

        System.out.println("iterator");
        Iterator<Integer> itr = ll.listIterator();
        System.out.println("using while loop");
        System.out.println("------------------");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("The loop End");
    }

}
