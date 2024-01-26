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

    private static void hashSetExample() {
        HashSet<Integer> numberHashSet = new HashSet<>();
        populateSet(numberHashSet);
        System.out.println("Example of HashSet");
        numberHashSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void linkedHashSetExample() {
        LinkedHashSet<Integer> numberLinkedHashSet = new LinkedHashSet<>();
        populateSet(numberLinkedHashSet);
        System.out.println("Example of LinkedHashSet");
        numberLinkedHashSet.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void sortedSetExample() {
        SortedSet<Integer> numberSortedSet = new TreeSet<>();
        populateSet(numberSortedSet);
        System.out.println("Example of SortedSet");
        numberSortedSet.parallelStream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void navigableSetExample() {
        NavigableSet<Integer> numberNavigableSet = new TreeSet<>();
        populateSet(numberNavigableSet);
        System.out.println("Example of NavigableSet");
        numberNavigableSet.parallelStream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void treeSetExample() {
        TreeSet<Integer> numberTreeSet = new TreeSet<>();
        populateSet(numberTreeSet);
        System.out.println("Example of TreeSet");
        numberTreeSet.parallelStream().map(e -> e + " ").forEach(System.out::print);
    }

    private static void populateSet(Set set) {
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(7);
        set.add(4);
    }
}
