import java.util.HashSet;
import java.util.Set;

/**
 * This program demonstrates the usage of HashSet in Java.
 *
 * Why use HashSet?
 * - A `HashSet` is a collection that stores unique elements only; it does not allow duplicates.
 * - It provides efficient methods for basic operations like adding, removing, and checking for
 *   the presence of elements.
 * - Uses a hash table for storing elements, allowing fast access, insertion, and deletion.

 * When to use HashSet?
 * - When you need a collection that automatically handles duplicate entries and ensures all elements are unique.
 * - When you need efficient search, insert, and delete operations without worrying about the order of elements.
 * - Suitable for situations like eliminating duplicates from a list or maintaining a collection of unique items.

 * Advantages of HashSet:
 * - Offers average constant time complexity O(1) for operations like `add()`, `remove()`, and `contains()`.
 * - Automatically handles duplicate elements, ensuring that all elements in the set are unique.
 * - Allows storing `null` values (only one `null` value).

 * Disadvantages of HashSet:
 * - Does not maintain any order of elements (no insertion order or sorted order). If you need order,
 *   consider using `LinkedHashSet` or `TreeSet`.
 * - It's not synchronized, meaning it’s not thread-safe for multi-threaded environments without
 *   external synchronization.
 * - Performance may degrade if many elements have the same hash code, resulting in more collisions.

 * Consider using other data structures instead of HashSet if:
 * - You need a sorted set (use `TreeSet`).
 * - You need to maintain insertion order (use `LinkedHashSet`).
 * - You need a thread-safe set (use `Collections.synchronizedSet()` or `ConcurrentSkipListSet`).
 */
public class HashSetPractice {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);

        hs.add(1);
        System.out.println(hs);

        hs.remove(3);
        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.contains("1"));
    }
}
