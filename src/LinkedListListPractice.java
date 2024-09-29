import java.util.Iterator;
import java.util.LinkedList;

/**
 * This program demonstrates the usage of LinkedList in Java.
 *
 * Why use LinkedList?
 * - A `LinkedList` is a data structure that allows elements to be stored as nodes with pointers
 *   to the next (and previous in case of a doubly linked list) element.
 * - It implements both `List` and `Deque` interfaces, meaning it can be used as both a list (like `ArrayList`)
 *   and a double-ended queue.
 * - Provides efficient insertions and deletions at both ends (head and tail) and at any arbitrary
 *   position in the list.

 * When to use LinkedList?
 * - When you need frequent insertions and deletions at both the beginning or end of the list.
 * - When you need a flexible list structure with dynamic memory allocation and do not require
 *   random access to elements.
 * - Useful in scenarios like implementing stacks, queues, or when list modifications are frequent.

 * Advantages of LinkedList:
 * - Efficient insertion and deletion at both ends or in the middle with O(1) complexity when the node is known.
 * - Doubly linked: Can be traversed in both forward and backward directions.
 * - Implements both `List` and `Deque` interfaces, making it versatile for use as a stack, queue,
 *   or double-ended queue.

 * Disadvantages of LinkedList:
 * - Slower access time compared to `ArrayList` for random access to elements since it requires traversing
 *   nodes sequentially (O(n) complexity).
 * - Uses more memory than `ArrayList` due to the additional storage needed for pointers (references to
 *   the next and previous nodes).
 * - Not synchronized, meaning it is not thread-safe without external synchronization.

 * Consider using other data structures instead of LinkedList if:
 * - You need fast random access to elements (use `ArrayList`).
 * - You have a memory-constrained environment, as `LinkedList` consumes more memory.
 * - You need a thread-safe list (consider using `CopyOnWriteArrayList` or `Collections.synchronizedList()`).
 */
public class LinkedListListPractice {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = getStringLinkedList();
        System.out.println(stringLinkedList);

        System.out.println(stringLinkedList.get(3));
        stringLinkedList.remove(3);
        System.out.println(stringLinkedList);

        stringLinkedList.remove("world");
        System.out.println(stringLinkedList);

        stringLinkedList.set(5, "Hames");
        System.out.println(stringLinkedList);

        System.out.println(stringLinkedList.contains("cat"));

        for (String string : stringLinkedList) {
            System.out.println(string += "a");
        }

        for (int i = 0; i < stringLinkedList.size(); i++) {
            System.out.println("String at position "+ i +" is: "+stringLinkedList.get(i));
        }

        Iterator it = stringLinkedList.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator element: " + it.next());
        }
    }

    private static LinkedList<String> getStringLinkedList() {
        //initial size = 10; when list exceeds 10, arraylist increases its size : n + n/2 + 1
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("John");
        stringLinkedList.add("Jane");
        stringLinkedList.add("Jack");
        stringLinkedList.add("James");
        stringLinkedList.add("Joe");

        stringLinkedList.add(2, "Meow");

        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("cat");

        stringLinkedList.addAll(3, strings);
        return stringLinkedList;
    }
}
