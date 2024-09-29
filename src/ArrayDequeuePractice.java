import java.util.ArrayDeque;

/**
 * This program demonstrates the usage of ArrayDeque in Java.
 *
 * Why use ArrayDeque?
 * - An ArrayDeque (short for "Array Double-Ended Queue") is a resizable array implementation of
 *   the `Deque` interface.
 * - It allows elements to be added or removed from both ends (front and rear) efficiently,
 *   making it suitable for use as both a stack and a queue.
 * - Provides better performance than `LinkedList` when used as a queue or stack.

 * When to use ArrayDeque?
 * - When you need a double-ended queue that supports element insertion and removal from both ends.
 * - When you need a stack or queue with better performance than `LinkedList`.
 * - When you want an alternative to `Stack` and `Queue` with better efficiency and no capacity limitations.

 * Advantages of ArrayDeque:
 * - No capacity restrictions: It can dynamically resize as elements are added, unlike `Array` or `Stack`.
 * - Faster than `LinkedList` when used as a queue (for both ends) because `ArrayDeque` does not
 *   involve the overhead of maintaining links between nodes.
 * - Provides constant-time O(1) performance for adding and removing elements from both ends.
 * - It can be used as a LIFO (Last-In-First-Out) stack or a FIFO (First-In-First-Out) queue.

 * Disadvantages of ArrayDeque:
 * - It cannot be used to store `null` elements, unlike other collections such as `ArrayList`.
 * - Random access to elements is slower compared to `ArrayList` because it doesn’t support indexed access.
 * - It does not support thread-safe operations, so it must be externally synchronized if
 *   accessed by multiple threads.

 * Consider using other data structures instead of ArrayDeque if:
 * - You need indexed access (use `ArrayList` instead).
 * - You need a thread-safe implementation for concurrent access (consider `ConcurrentLinkedDeque`).
 */
public class ArrayDequeuePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.offer(1);
        integerArrayDeque.offer(2);
        integerArrayDeque.offer(3);
        integerArrayDeque.offer(4);
        integerArrayDeque.offer(5);

        System.out.println(integerArrayDeque);

        integerArrayDeque.offerFirst(77);
        integerArrayDeque.offerLast(88);
        System.out.println(integerArrayDeque);

        System.out.println(integerArrayDeque.peek());
        System.out.println(integerArrayDeque.peekFirst());
        System.out.println(integerArrayDeque.peekLast());
        System.out.println(integerArrayDeque);

        System.out.println(integerArrayDeque.poll());
        System.out.println(integerArrayDeque.pollFirst());
        System.out.println(integerArrayDeque.pollLast());
        System.out.println(integerArrayDeque);
    }
}
