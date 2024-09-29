import java.util.Set;
import java.util.TreeSet;

/**
 * This program demonstrates the usage of TreeSet in Java.
 *
 * Why use TreeSet?
 * - A `TreeSet` is a Set implementation that stores its elements in a sorted order based on their natural
 *   ordering or a specified comparator.
 * - It provides a way to maintain a unique collection of elements while ensuring they are sorted,
 *   which is useful for scenarios requiring ordered data.
 * - Ideal for applications where you need to maintain a collection of unique elements in a specific order.

 * When to use TreeSet?
 * - When you need a set that automatically sorts its elements upon insertion.
 * - Suitable for tasks like managing a collection of unique items, implementing a priority list, or
 *   any situation where duplicates are not allowed, but ordering is essential.
 * - When you require operations that benefit from sorted data, such as finding a range of elements or
 *   performing ordered traversal.

 * Advantages of TreeSet:
 * - Automatically maintains the elements in sorted order, enabling efficient ordered operations.
 * - Provides O(log n) time complexity for basic operations like `add()`, `remove()`, and `contains()`.
 * - Supports methods for range queries, such as `subSet()`, `headSet()`, and `tailSet()`.

 * Disadvantages of TreeSet:
 * - Slower than `HashSet` for operations like `add()`, `remove()`, and `contains()` due to the overhead
 *   of maintaining order (O(log n) vs. O(1)).
 * - Requires more memory than `HashSet` because it stores additional information to maintain the tree structure.
 * - Not synchronized; it is not thread-safe for concurrent access. You may need to synchronize it externally
 *   in multi-threaded environments.

 * Consider using other data structures instead of TreeSet if:
 * - You do not require sorted order (use `HashSet` for faster access).
 * - You need thread-safe operations (consider using `Collections.synchronizedSet()`).
 * - You require guaranteed performance for basic operations with predictable iteration order (use `LinkedHashSet`).
 */
public class TreeSetPractice {
    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add("G");
        set.add("E");
        set.add("D");
        set.add("C");
        set.add("B");

        System.out.println(set);

        set.add("A");
        System.out.println(set);

        set.remove("E");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains("B"));

    }
}
