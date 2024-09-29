import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * This program demonstrates the usage of PriorityQueue in Java.
 *
 * Why use PriorityQueue?
 * - A `PriorityQueue` is a type of queue that orders its elements based on their priority rather
 *   than their insertion order.
 * - It provides an efficient way to manage elements where each element has a certain priority,
 *   ensuring that the highest priority elements are processed first.
 * - Ideal for implementing algorithms that require sorting or managing tasks based on priority,
 *   such as scheduling tasks in operating systems.

 * When to use PriorityQueue?
 * - When you need a queue that processes elements based on priority rather than the order in which they were added.
 * - Suitable for scenarios like task scheduling, Dijkstra's algorithm for shortest paths, Huffman coding,
 *   or any application that requires elements to be processed in a specific order based on a priority level.

 * Advantages of PriorityQueue:
 * - Automatically orders elements based on their natural ordering or a specified comparator, making it easy
 *   to retrieve the highest (or lowest) priority element.
 * - Provides O(log n) time complexity for insertion and removal of the highest priority element.
 * - Dynamic size; it grows as needed and can handle any number of elements.

 * Disadvantages of PriorityQueue:
 * - Does not allow null elements; attempting to add null will throw a NullPointerException.
 * - Does not maintain the order of elements with the same priority. For that, a custom comparator
 *   or an additional data structure may be needed.
 * - Not thread-safe; it needs external synchronization if used in a multi-threaded environment.

 * Consider using other data structures instead of PriorityQueue if:
 * - You need a simple queue with FIFO order (use `LinkedList` or `ArrayDeque`).
 * - You require stable ordering of elements with the same priority (use `TreeMap`
 *   or `LinkedHashMap` along with sorting).
 * - You need a thread-safe implementation (consider `ConcurrentSkipListSet` or use a locking mechanism).
 */
public class PriorityQueuePractice {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq);
    }
}
