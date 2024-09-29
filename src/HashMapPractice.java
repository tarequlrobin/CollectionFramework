import java.util.HashMap;
import java.util.Map;

/**
 * This program demonstrates the usage of HashMap in Java.
 *
 * Why use HashMap?
 * - A `HashMap` is a data structure that allows storing key-value pairs.
 * - It provides a way to associate unique keys with specific values, allowing efficient retrieval,
 *   insertion, and deletion of elements based on their keys.
 * - It uses a hashing mechanism, which makes operations like `get()`, `put()`, and `remove()` very efficient.

 * When to use HashMap?
 * - When you need to map unique keys to values and require fast access, insertion, and deletion operations.
 * - When you have large data sets that need to be stored and accessed by a unique key,
 *   like caching data, storing configuration settings, or mapping IDs to objects.

 * Advantages of HashMap:
 * - Provides average constant time complexity O(1) for basic operations like `get()` and `put()`.
 * - Allows storing one `null` key and multiple `null` values.
 * - Flexible and dynamic: It automatically adjusts its size when elements are added, meaning
 *   no fixed size is needed.
 * - It's highly efficient for large data sets where quick access to elements is needed based on unique keys.

 * Disadvantages of HashMap:
 * - It does not maintain any order of its elements (keys or values). If you need sorted order,
 *   consider using `TreeMap` or `LinkedHashMap`.
 * - It's not synchronized, meaning it's not thread-safe by default. If you need thread safety,
 *   use `Collections.synchronizedMap()` or `ConcurrentHashMap`.
 * - Performance can degrade if many keys have the same hash code, leading to more collisions and
 *   a higher number of elements in the same bucket.

 * Consider using other data structures instead of HashMap if:
 * - You need elements to be stored in a sorted or insertion order (use `TreeMap` or `LinkedHashMap`).
 * - You need a thread-safe implementation (use `ConcurrentHashMap` or `Hashtable`).
 */
public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("bd", "Bangladesh");
        map.put("nep", "Nepal");
        map.put("usa", "United States");
        map.put("jap", "Japan");
        map.put("chi", "China");
        //overrides value of duplicate key.
        map.put("usa", "United States");

        if (!map.containsKey("jap")) {
            map.put("jap", "Japan");
        }

        map.putIfAbsent("usa", "United States");

        System.out.println(map);

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
