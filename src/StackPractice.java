import java.util.Stack;

/**
 * This program demonstrates the usage of Stack in Java.
 *
 * Why use Stack?
 * - A `Stack` is a data structure that follows the Last In, First Out (LIFO) principle, where the last
 *   element added is the first to be removed.
 * - It provides a way to manage data in a sequential manner, enabling efficient access to the most recently
 *   added elements.
 * - Useful for scenarios where you need to reverse elements, perform backtracking, or keep track of previous
 *   states in algorithms.

 * When to use Stack?
 * - When you need to maintain a collection of elements in a LIFO order.
 * - Suitable for implementing functionality like undo mechanisms in applications, parsing expressions
 *   (like in calculators), or depth-first search algorithms in graph theory.

 * Advantages of Stack:
 * - Simple and intuitive data structure for managing elements in a LIFO manner.
 * - Provides constant time complexity O(1) for basic operations such as `push()` (adding an element)
 *   and `pop()` (removing an element).
 * - Built-in support for operations like `peek()` to retrieve the top element without removing it.

 * Disadvantages of Stack:
 * - Limited to LIFO access; you cannot access elements in the middle of the stack without popping
 *   elements off the top.
 * - Not synchronized, meaning it is not thread-safe by default. You may need to implement your own
 *   synchronization for multi-threaded contexts.
 * - The capacity is limited by the size of the array backing the stack, which can lead
 *   to `StackOverflowError` if not handled properly in recursive scenarios.

 * Consider using other data structures instead of Stack if:
 * - You need access to elements in a different order (consider using `ArrayList` or `LinkedList` for general lists).
 * - You require thread-safe operations (consider using `Deque` as a stack or use `Collections.synchronizedList()`).
 */
public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());
    }
}
