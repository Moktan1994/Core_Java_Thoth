package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Psg");
        ll.add("Real Madrid");
        ll.add("Manchester City");
        ll.add("Liverpool");
        ll.add("Inter Miami");
        ll.add("Barcelona");
        ll.add("Juventus");
        //ll.addFirst("Bayern Munich");
        //ll.addLast("Dortmund");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll);
        }


    }
}
