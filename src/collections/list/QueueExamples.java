package collections.list;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

public class QueueExamples {
    public static void main(String... args) {
        queueExample();
    }

    /**
     * Queue
     * Follows - It follows FIFO (First In and First Out) means first element added will be removed first.
     * Addition - Elements will be added at the rear end of the queue and will be removed at the front end of the queue.
     * Unordered - Insertion order will not be maintained.
     * Popular Methods
     * add(Object o) or offer(Object o)
     * remove() or poll()
     * peek() or element()
     * isEmpty()
     * size()
     * */

    public static void queueExample() {
        Queue<Integer> numberQueue = new PriorityQueue<>();
        populateQueue(numberQueue);
        System.out.println("Example of Queue");
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        numberQueue.offer(12);
        System.out.println();
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        numberQueue.poll();
        System.out.println();
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    /**
     * Queue
     * Follows - It follows FIFO (First In and First Out) means first element added will be removed first.
     * Addition - Elements will be added at the rear end of the queue and will be removed at the front end of the queue.
     * Ordered - Insertion order will be maintained.
     * Popular Methods
     * add(Object o) or offer(Object o)
     * remove() or poll()
     * peek() or element()
     * isEmpty()
     * size()
     * */

    public static void arrayDequeueExample() {
        ArrayDeque<Integer> numberQueue = new ArrayDeque<>();
        populateQueue(numberQueue);
        System.out.println("Example of Queue");
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        numberQueue.offer(12);
        System.out.println();
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        numberQueue.poll();
        System.out.println();
        numberQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void priorityQueueExample() {
        PriorityQueue<Integer> numberPriorityQueue = new PriorityQueue<>();
        populateQueue(numberPriorityQueue);
        System.out.println("Example of PriorityQueue");
        numberPriorityQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void blockingQueueExample() {
        BlockingQueue<Integer> numberBlockingQueue = new PriorityBlockingQueue<>();
        populateQueue(numberBlockingQueue);
        System.out.println("Example of PriorityQueue");
        numberBlockingQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void priorityBlockingQueueExample() {
        PriorityBlockingQueue<Integer> numberPriorityBlockingQueue = new PriorityBlockingQueue<>();
        populateQueue(numberPriorityBlockingQueue);
        System.out.println("Example of PriorityQueue");
        numberPriorityBlockingQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void linkedBlockingQueueExample() {
        LinkedBlockingQueue<Integer> numberLinkedBlockingQueue = new LinkedBlockingQueue<>();
        populateQueue(numberLinkedBlockingQueue);
        System.out.println("Example of PriorityQueue");
        numberLinkedBlockingQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void linkedTransferQueueExample() {
        LinkedTransferQueue<Integer> numberLinkedTransferQueue = new LinkedTransferQueue<>();
        populateQueue(numberLinkedTransferQueue);
        System.out.println("Example of PriorityQueue");
        numberLinkedTransferQueue.stream().map(e -> e + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void populateQueue(Queue queue) {
        queue.add(4);
        queue.add(6);
        queue.add(2);
        queue.add(0);
        queue.add(9);
        queue.add(3);
    }
}
