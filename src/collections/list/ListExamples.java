package collections.list;

import java.util.*;
import java.util.stream.Collectors;

public class ListExamples {
    public static void main(String[] args) {
        linkedListExample();
        arrayListExample();
        vectorExample();
        stackExample();
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
     * Vector
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
        System.out.println("Example of Vector");
        numberVector.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
        List<Integer> reversedList = numberVector.reversed();
        reversedList.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * Stack
     * Follows - Stack follows LIFO Order (Last In and First Out) means last element added will be removed first.
     * Use Case - Stacks are used for Backtracking algorithms to explore different solutions.
     * Popular Methods
     * add(Object o)
     * add(int index, Object o)
     * push(Object o)
     * get(int index)
     * getFirst()
     * getLast()
     * pop()
     * peek()
     * isEmpty()
     * size()
     * set(int index, Object o)
     * setElement(Object o, int index)
     * remove(int index)
     * remove(Object o)
     * removeFirst()
     * removeLast()
     * removeAll()
     * */
    private static void stackExample() {
        Stack<Integer> numberStack = new Stack<>();
        populateList(numberStack);
        System.out.println("Example of Stack");
        numberStack.parallelStream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
        int numberPopped = numberStack.pop();
        System.out.println("Number Popped: " + numberPopped);
        numberStack.parallelStream().map(e -> e + " ").forEach(System.out::print);
        int numberPeeked = numberStack.peek();
        System.out.println();
        System.out.println("Number Peeked: " + numberPeeked);
        numberStack.parallelStream().map(e -> e + " ").forEach(System.out::print);
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
