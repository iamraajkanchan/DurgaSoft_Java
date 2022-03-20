package Collections.list;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.add(2, "M");
        l.add("N");
        System.out.println(l);
    }
}