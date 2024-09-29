import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This program demonstrates the usage of LinkedHashSet in Java.
 *
 * Why use LinkedHashSet?
 * - A `LinkedHashSet` is a collection that combines the unique element property of `HashSet` with
 *   the predictable iteration order of a linked list.
 * - It maintains the order in which elements are inserted, making it suitable when both uniqueness
 *   and order are required.
 * - Ideal for scenarios where you need to eliminate duplicates but still need to process elements
 *   in a specific order.

 * When to use LinkedHashSet?
 * - When you need a set that guarantees unique elements but also maintains insertion order.
 * - When you want a set that provides consistent iteration order across multiple iterations.
 * - Suitable for tasks like eliminating duplicates from a list while maintaining the order of
 *   elements as they appeared.

 * Advantages of LinkedHashSet:
 * - Maintains the insertion order of elements, unlike `HashSet`.
 * - Provides average constant time complexity O(1) for basic operations like `add()`, `remove()`, and `contains()`.
 * - Allows storing `null` values (only one `null` value).

 * Disadvantages of LinkedHashSet:
 * - Slightly slower than `HashSet` due to the overhead of maintaining insertion order using a linked list.
 * - Not synchronized, meaning it’s not thread-safe for multi-threaded environments. You need to externally
 *   synchronize it if used in a concurrent setting.

 * Consider using other data structures instead of LinkedHashSet if:
 * - You don't need to maintain any specific order (use `HashSet` for better performance).
 * - You need sorted elements (use `TreeSet`).
 * - You need a thread-safe set (consider `Collections.synchronizedSet()` or `ConcurrentSkipListSet`).
 */
public class LinkedHashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println(set);

        set.add("1");
        System.out.println(set);

        set.remove("E");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains("1"));
    }
}
