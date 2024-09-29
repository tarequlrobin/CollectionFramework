import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This program demonstrates the usage of LinkedHashMap in Java.
 *
 * Why use LinkedHashMap?
 * - A `LinkedHashMap` is a combination of `HashMap` and a linked list, which means it maintains
 *   insertion order or access order.
 * - It allows storing key-value pairs, similar to `HashMap`, but with predictable iteration order.
 * - It is ideal when you need a map that provides fast access to elements while also maintaining
 *   the order in which elements are inserted.

 * When to use LinkedHashMap?
 * - When you need to store key-value pairs with predictable iteration order.
 * - When you need to maintain insertion order (the order in which elements were added) or access
 *   order (the order in which elements are accessed if access order is enabled).
 * - Useful for implementing LRU (Least Recently Used) cache when access order is enabled.

 * Advantages of LinkedHashMap:
 * - Maintains a predictable iteration order, unlike `HashMap`.
 * - Provides average constant-time complexity O(1) for basic operations like `get()` and `put()`.
 * - Allows one `null` key and multiple `null` values.
 * - Can be configured to maintain access order (by passing `true` to the `accessOrder` parameter in the constructor).

 * Disadvantages of LinkedHashMap:
 * - Slightly slower than `HashMap` due to the overhead of maintaining a linked list to keep the insertion/access order.
 * - It’s not thread-safe, meaning it needs to be synchronized externally if used in a multi-threaded environment.

 * Consider using other data structures instead of LinkedHashMap if:
 * - You don’t need to maintain any specific order (use `HashMap` for better performance).
 * - You need a sorted order of keys (use `TreeMap`).
 * - You need a thread-safe map (use `ConcurrentHashMap`).
 */
public class LinkedHashMapPractice {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

//        linkedHashMap.put("a", "a");
//        linkedHashMap.put("c", "c");
//        linkedHashMap.put("b", "b");
//        linkedHashMap.put("d", "d");

        linkedHashMap.put("bd", "Bangladesh");
        linkedHashMap.put("nep", "Nepal");
        linkedHashMap.put("usa", "United States");
        linkedHashMap.put("jap", "Japan");
        linkedHashMap.put("chi", "China");
        linkedHashMap.put("usa", "United States");
        linkedHashMap.put("jap", "Japan");

        System.out.println(linkedHashMap);

        // Accessing a value using its key
        String countryName = linkedHashMap.get("usa"); // Getting the product name with ID "usa"
        System.out.println(countryName);

        // Checking if a key exists in the LinkedHashMap
        if (linkedHashMap.containsKey("bd")) {
            System.out.println("Country Bangladesh exists.");
        }

        // Removing a key-value pair from the LinkedHashMap
        linkedHashMap.remove("nep"); // Removing the product with ID 103
        System.out.println("LinkedHashMap after removing Nepal: " + linkedHashMap);

        // Checking the size of the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Number of countries in the map: " + size);

        // Clearing all elements from the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);

        // Checking if the LinkedHashMap is empty
        if (linkedHashMap.isEmpty()) {
            System.out.println("The LinkedHashMap is empty.");
        }
    }
}
