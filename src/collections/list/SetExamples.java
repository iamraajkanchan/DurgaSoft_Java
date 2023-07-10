package collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExamples {
    public static void main(String... a) {
        LinkedHashSet<Integer> numberLinkedHashSet =  new LinkedHashSet<>();
        numberLinkedHashSet.add(1);
        numberLinkedHashSet.add(3);
        numberLinkedHashSet.add(2);
        numberLinkedHashSet.add(2);
        numberLinkedHashSet.add(6);
        numberLinkedHashSet.add(5);
        numberLinkedHashSet.add(7);
        numberLinkedHashSet.add(4);
        System.out.println("Example of LinkedHashSet");
        numberLinkedHashSet.forEach(System.out::print);
        System.out.println();
        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(1);
        numberHashSet.add(3);
        numberHashSet.add(2);
        numberHashSet.add(2);
        numberHashSet.add(6);
        numberHashSet.add(5);
        numberHashSet.add(7);
        numberHashSet.add(4);
        System.out.println("Example of HashSet");
        numberHashSet.forEach(System.out::print);
        System.out.println();
    }
}
