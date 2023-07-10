package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExamples {
    public static void main(String[] args) {
        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        numberLinkedList.add(1);
        numberLinkedList.add(3);
        numberLinkedList.add(4);
        numberLinkedList.add(2);
        numberLinkedList.add(8);
        numberLinkedList.add(5);
        numberLinkedList.add(7);
        numberLinkedList.removeLast();
        System.out.println("Example of LinkedList");
        numberLinkedList.forEach(System.out::print);
        System.out.println();

        ArrayList<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(3);
        numberArrayList.add(4);
        numberArrayList.add(2);
        numberArrayList.add(8);
        numberArrayList.add(5);
        numberArrayList.add(7);
        System.out.println("Example of ArrayList");
        numberArrayList.forEach(System.out::print);
        System.out.println();
    }
}
