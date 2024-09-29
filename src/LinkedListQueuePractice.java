import java.util.LinkedList;
import java.util.Queue;

/**
 * This program demonstrates the usage of LinkedList as a Queue in Java.
 *
 * Why use LinkedList as a Queue?
 * - A `LinkedList` can be used as a queue because it implements the `Deque` interface, allowing it to operate
 *   as both a stack and a queue.
 * - It allows for efficient insertion and removal of elements from both ends of the list, making it ideal
 *   for FIFO (First In, First Out) data structures.
 * - Using `LinkedList` for a queue means that you do not need to worry about the maximum size, as it can
 *   grow dynamically.

 * When to use LinkedList as a Queue?
 * - When you need to implement a queue data structure that requires fast insertions and deletions at both ends.
 * - When you are processing tasks in the order they were added, such as in task scheduling, breadth-first
 *   search algorithms, or any scenario where the order of processing is critical.

 * Advantages of LinkedList as a Queue:
 * - O(1) time complexity for `add()`, `remove()`, and `peek()` operations when working with the ends of the list.
 * - Doubly linked nature allows for efficient addition and removal of elements from both the head and tail
 *   of the queue.
 * - No capacity limitations as it dynamically resizes, accommodating any number of elements until memory is exhausted.

 * Disadvantages of LinkedList as a Queue:
 * - Uses more memory than an array-based queue (like `ArrayDeque`) due to the additional storage
 *   for pointers to the next and previous nodes.
 * - Slightly slower than array-based implementations in terms of access time, as it requires traversing nodes.
 * - Not synchronized, meaning it is not thread-safe by default. You may need to implement your
 *   own synchronization if used in a multi-threaded context.

 * Consider using other data structures instead of LinkedList for a Queue if:
 * - You need a queue with a fixed size and want to avoid excessive memory usage (consider `ArrayDeque`).
 * - You need a thread-safe implementation (consider `ConcurrentLinkedQueue` or `BlockingQueue`).
 */
public class LinkedListQueuePractice {
    public static void main(String[] args) {
        // Creating a LinkedList to implement a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Task 1"); // Adds "Task 1" to the end of the queue
        queue.add("Task 2"); // Adds "Task 2" to the end of the queue
        queue.add("Task 3"); // Adds "Task 3" to the end of the queue

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Accessing the head of the Queue without removing it
        String nextTask = queue.peek(); // Retrieves the head of the queue
        System.out.println("Next task to process: " + nextTask);

        // Removing elements from the Queue
        String processedTask = queue.remove(); // Removes and retrieves the head of the queue
        System.out.println("Processed: " + processedTask);
        System.out.println("Queue after processing a task: " + queue);

        // Iterating over the Queue
        System.out.println("Iterating through the Queue:");
        for (String task : queue) {
            System.out.println(task);
        }

        // Checking the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Clearing all elements from the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);

        // Checking if the Queue is empty
        if (queue.isEmpty()) {
            System.out.println("The Queue is empty.");
        }
    }
}
