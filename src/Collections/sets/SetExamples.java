package Collections.sets;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        List<Integer> evenList = new ArrayList<>();
        evenList.add(0);
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);

        List<Integer> oddList = new ArrayList<>();
        oddList.add(1);
        oddList.add(3);
        oddList.add(5);
        oddList.add(7);
        oddList.add(9);

        List<Integer> mixedNumberList = new ArrayList<>();
        mixedNumberList.add(10);
        mixedNumberList.add(42);
        mixedNumberList.add(53);
        mixedNumberList.add(65);
        mixedNumberList.add(29);

        LinkedHashSet<Integer> numberLinkedHashSet = new LinkedHashSet<>();
        numberLinkedHashSet.add(12);
        // You can add a null value in LinkedHashSet
        numberLinkedHashSet.add(null);
        numberLinkedHashSet.add(21);
        numberLinkedHashSet.add(34);
        numberLinkedHashSet.add(54);
        numberLinkedHashSet.add(75);
        System.out.println("Example of Linked Hash Set");
        numberLinkedHashSet.forEach(number -> System.out.print(" " + number));
        System.out.println();
        System.out.println("==========================");

        System.out.println("Example of Heterogeneous Linked Hash Set");
        LinkedHashSet<List<Integer>> numberListLinkedHashSet = new LinkedHashSet<>();
        numberListLinkedHashSet.add(evenList);
        numberListLinkedHashSet.add(oddList);
        numberListLinkedHashSet.add(mixedNumberList);
        numberListLinkedHashSet.forEach(numberList -> numberList.forEach(number -> System.out.print(" " + number)));
        System.out.println();
        System.out.println("==========================");

        HashSet<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(12);
        // You can add a null value in HashSet
        numberHashSet.add(null);
        numberHashSet.add(21);
        numberHashSet.add(34);
        numberHashSet.add(54);
        numberHashSet.add(75);
        System.out.println("Example of Hash Set");
        numberHashSet.forEach(number -> {
            System.out.print(" " + number);
        });
        System.out.println();
        System.out.println("==========================");
        System.out.println("Example of Heterogeneous Hash Set");
        HashSet<List<Integer>> numberListHashSet = new HashSet<>();
        numberListHashSet.add(evenList);
        numberListHashSet.add(oddList);
        numberListHashSet.add(mixedNumberList);
        numberListHashSet.forEach(numberList -> numberList.forEach(number -> System.out.print(" " + number)));
        System.out.println();
        System.out.println("==========================");
        TreeSet<Integer> numberTreeSet = new TreeSet<>();
        numberTreeSet.add(12);
        // You cannot add a null value in TreeSet
        // numberTreeSet.add(null);
        numberTreeSet.add(21);
        numberTreeSet.add(34);
        numberTreeSet.add(54);
        numberTreeSet.add(75);
        System.out.println("Example of Tree Set");
        numberTreeSet.forEach(number -> System.out.print(" " + number));
        System.out.println();
        System.out.println("==========================");
        System.out.println("Example of Heterogeneous Tree Set");
        TreeSet<List<Integer>> numberListTreeSet = new TreeSet<>();
        numberListTreeSet.add(evenList);
        numberListTreeSet.add(oddList);
        numberListTreeSet.add(mixedNumberList);
        numberListTreeSet.forEach(numberList -> numberList.forEach(number -> System.out.print(" " + number)));
    }
}
