package collections.list;

import java.util.*;

public class SetExamples {
    public static void main(String... a) {
        hashSetExample();
        linkedHashSetExample();
        sortedSetExample();
        navigableSetExample();
        treeSetExample();
    }

    /**
     * HashSet
     * Hashing - It uses a hashing mechanism to store elements.
     * No Duplicates - You can insert duplicate values in HashSet but, the duplicates ones will not be added in the set.
     * Unordered - It doesn't maintain the insertion order.
     * Null Value - It can contain one null value. You can insert another null value but, it will not be added in the set.
     * Use case -
     * Use it when you want to get unique values from a collection without considering the insertion order.
     * */

    private static void hashSetExample() {
        HashSet<Integer> numberHashSet = new HashSet<>();
        populateSet(numberHashSet);
        System.out.println("Example of HashSet");
        numberHashSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * LinkedHashSet
     * Hashing
     * No Duplicates - You can insert duplicate values in LinkedHashSet but, the duplicate ones will not be added in the set.
     * Null Value - It can contain one null value. You can insert another null value but, it will not be added in the set.
     * Ordered - It maintains the insertion order.
     * Use cse -
     * Use it when you want to get a unique values from a collection and do consider the insertion order as important.
     * */
    private static void linkedHashSetExample() {
        LinkedHashSet<Integer> numberLinkedHashSet = new LinkedHashSet<>();
        populateSet(numberLinkedHashSet);
        System.out.println("Example of LinkedHashSet");
        numberLinkedHashSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * SortedSet
     * No Duplicates - You can insert duplicate values in LinkedHashSet but, the duplicate ones will not be added in the set.
     * Null Value - You cannot insert null value in it. If you do, it will throw runtime NullPointerException.
     * Unordered - It doesn't maintain the insertion order.
     * Use case -
     * Use it when you want to get a unique sorted values from a collection without considering the insertion order.
     * */
    private static void sortedSetExample() {
        SortedSet<Integer> numberSortedSet = new TreeSet<>();
        populateSet(numberSortedSet);
        System.out.println("Example of SortedSet");
        numberSortedSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * NavigableSet
     * No Duplicates - You can insert duplicate values in LinkedHashSet but, the duplicate ones will not be added in the set.
     * Null Value - You cannot insert null value in it. If you do, it will throw runtime NullPointerException.
     * Unordered - It doesn't maintain the insertion order.
     * */
    private static void navigableSetExample() {
        NavigableSet<Integer> numberNavigableSet = new TreeSet<>();
        populateSet(numberNavigableSet);
        System.out.println("Example of NavigableSet");
        numberNavigableSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * TreeSet
     * No Duplicates - You can insert duplicate values in LinkedHashSet but, the duplicate ones will not be added in the set.
     * Null Value - You cannot insert null value in it. If you do, it will throw runtime NullPointerException.
     * Unordered - It doesn't maintain the insertion order.
     * */
    private static void treeSetExample() {
        TreeSet<Integer> numberTreeSet = new TreeSet<>();
        populateSet(numberTreeSet);
        System.out.println("Example of TreeSet");
        numberTreeSet.stream().map(e -> e + " ").forEach(System.out::print);
    }

    private static void populateSet(Set set) {
        set.add(1);
        set.add(3);
        set.add(2);
        if (!(set instanceof TreeSet<?>)) {
            set.add(null);
        }
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(7);
        if (!(set instanceof TreeSet<?>)) {
            set.add(null);
        }
        set.add(4);
    }
}
