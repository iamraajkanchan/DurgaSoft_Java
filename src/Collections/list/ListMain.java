package Collections.list;

import java.io.Serializable;
import java.util.*;

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

        /* Here the below arrayList object is non-synchronized and is not Thread-Safe */
        ArrayList arrayList = new ArrayList<>();
        /* To attain Synchronized and Thread-Safe feature we are using the below code */
        List list = Collections.synchronizedList(arrayList);
        LinkedList linkedList = new LinkedList();
        System.out.println(arrayList instanceof Serializable); // true
        System.out.println(linkedList instanceof Serializable); // true
        System.out.println(arrayList instanceof Cloneable); // true
        System.out.println(linkedList instanceof Cloneable); // true
        System.out.println(arrayList instanceof RandomAccess); // true
        System.out.println(linkedList instanceof RandomAccess); // false
    }
}