package collections.list;

import java.util.*;
import java.util.stream.Collectors;

public class ListExamples {
    public static void main(String[] args) {
        linkedListExample();
        arrayListExample();
        vectorExample();
        flatMapExample();
    }

    private static void linkedListExample() {
        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        populateList(numberLinkedList);
        numberLinkedList.removeLast();
        numberLinkedList.removeFirst();
        System.out.println("Example of LinkedList");
        numberLinkedList.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void arrayListExample() {
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        populateList(numberArrayList);
        System.out.println("Example of ArrayList");
        numberArrayList.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * Flexible - Vectors can grow as needed to accommodate new elements
     * Thread Safe - Vectors are thread safe. They can be easily accessed by multiple threads.
     * Caution - Vectors are slow as compared to ArrayList because of their thread-safety mechanisms.
     * Use - Prefer Vector over ArrayList for thread safety, if you want to use a List for multiple threads.
     * Popular methods -
     * add(Object o)
     * add(int index, Object o)
     * get(int index)
     * contains(Object o)
     * remove(int index)
     * set(int index, Object 0)
     * size()
     * capacity()
     */
    private static void vectorExample() {
        Vector<Integer> numberVector = new Vector<>();
        populateList(numberVector);
        List<Integer> reversedList = numberVector.reversed();
        System.out.println("Example of Vector");
        numberVector.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
        reversedList.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    private static void flatMapExample() {
        List<String> words = Arrays.asList("hello", "world");
        System.out.println("Example of flatMap");
        List<Character> flattenedChars = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(flattenedChars);
    }

    private static void populateList(List list) {
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(7);
    }
}
