import java.util.Map;
import java.util.TreeMap;

/**
 * This program demonstrates the usage of TreeMap in Java.
 *
 * Why use TreeMap?
 * - A `TreeMap` is a map implementation that stores key-value pairs in a sorted order based on the natural ordering of keys or a specified comparator.
 * - It provides a way to maintain a sorted collection of keys, allowing for efficient range queries and ordered traversal.
 * - Ideal for scenarios where sorted order is essential, such as managing data that needs to be frequently accessed in a sorted manner.

 * When to use TreeMap?
 * - When you need a map that maintains a sorted order of its keys.
 * - Suitable for tasks like implementing a phone book, a leaderboard, or any other application where the order of keys is important.
 * - When you require operations that benefit from sorted data, such as finding the closest key or performing range queries.

 * Advantages of TreeMap:
 * - Automatically keeps the entries sorted according to the keys, enabling efficient ordered operations.
 * - Provides O(log n) time complexity for basic operations like `put()`, `get()`, and `remove()`.
 * - Allows for efficient range view operations, such as `subMap()`, `headMap()`, and `tailMap()`.

 * Disadvantages of TreeMap:
 * - Slower than `HashMap` for operations like `put()` and `get()` due to the overhead of maintaining order (O(log n) vs. O(1)).
 * - Requires more memory than `HashMap` because it stores additional information to maintain the tree structure.
 * - Not synchronized; it is not thread-safe for concurrent access. You may need to synchronize it externally in multi-threaded environments.

 * Consider using other data structures instead of TreeMap if:
 * - You do not require sorted order (use `HashMap` for faster access).
 * - You need thread-safe operations (consider using `ConcurrentHashMap`).
 * - You require guaranteed performance for basic operations (use `LinkedHashMap` for predictable iteration order).
 */
public class TreeMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new TreeMap<>();
        //sorts according to key order

        studentScores.put("Alice", 85); // Adds entry for Alice with score 85
        studentScores.put("Bob", 90);   // Adds entry for Bob with score 90
        studentScores.put("Charlie", 80); // Adds entry for Charlie with score 80
        studentScores.put("David", 95);

        // Displaying the TreeMap
        System.out.println("TreeMap (sorted by key): " + studentScores);

        // Accessing a value based on its key
        Integer score = studentScores.get("Bob"); // Retrieves Bob's score
        System.out.println("Bob's score: " + score);

        // Removing an entry from the TreeMap
        studentScores.remove("Alice"); // Removes Alice's entry
        System.out.println("TreeMap after removing Alice: " + studentScores);

        // Iterating over the TreeMap entries
        System.out.println("Iterating through the TreeMap:");
        for (String name : studentScores.keySet()) {
            System.out.println(name + ": " + studentScores.get(name));
        }

        // Displaying a subMap (students with scores less than 90)
        System.out.println("Students with scores less than 90: " + ((TreeMap<String, Integer>) studentScores).headMap("Bob"));

        // Checking if the TreeMap contains a specific key
        if (studentScores.containsKey("Charlie")) {
            System.out.println("Charlie is in the TreeMap.");
        }

        // Clearing all entries from the TreeMap
        studentScores.clear();
        System.out.println("TreeMap after clearing: " + studentScores);

        // Checking if the TreeMap is empty
        if (studentScores.isEmpty()) {
            System.out.println("The TreeMap is empty.");
        }
    }
}
