package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        ll.add("black");
        ll.add("white");
        ll.add("green");
        ll.add("blue");
        ll.add("yellow");
        ll.add("grey");
        ll.remove(5);
        ll.set(3,"orange");

        System.out.println(ll.size());
        System.out.println(ll);

        System.out.println("iteration");
        System.out.println("------------");
        System.out.println("foreach loop print");
        System.out.println("------------");
        for (String ss:ll) {
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
        Iterator<String> itr = ll.listIterator();
        System.out.println("using while loop");
        System.out.println("------------------");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("The loop End");
    }

}
