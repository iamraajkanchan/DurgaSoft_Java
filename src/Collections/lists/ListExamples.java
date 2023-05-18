package Collections.lists;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<Serializable> l = new ArrayList<>();
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

        System.out.println("=========================");
        System.out.println("Example of ArrayList");
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(32);
        numberArrayList.add(65);
        numberArrayList.add(78);
        numberArrayList.add(90);
        numberArrayList.add(22);
        numberArrayList.add(43);
        numberArrayList.forEach(number -> System.out.print(" " + number));

        System.out.println();
        System.out.println("=========================");
        System.out.println("Example of LinkedList");
        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        numberLinkedList.add(32);
        numberLinkedList.add(65);
        numberLinkedList.add(78);
        numberLinkedList.add(90);
        numberLinkedList.add(22);
        numberLinkedList.add(43);
        numberLinkedList.forEach(number -> System.out.print(" " + number));
        System.out.println("=========================");

    }
}