import java.util.ArrayList;
import java.util.Iterator;

/**
 * This program demonstrates the usage of ArrayList in Java.
 *
 * Why use ArrayList?
 * - An ArrayList is a dynamic array that allows us to store elements of the same type.
 * - Unlike regular arrays, an ArrayList can grow or shrink in size as needed, making it more flexible.
 * - It provides convenient methods for adding, removing, and accessing elements,
 *   making it easier to manage collections of data.

 * When to use ArrayList?
 * - When you need a resizable array structure (i.e., when the number of elements is not fixed).
 * - When you need fast access to elements using an index (i.e., retrieving elements by their position).
 * - When you frequently need to add or remove elements at the end of the list.

 * Advantages of ArrayList:
 * - Dynamic resizing: Automatically grows as elements are added, reducing the need to manage array
 *   size manually.
 * - Provides built-in methods for common operations like adding, removing, and searching for elements.
 * - Allows random access to elements in constant time O(1), which makes retrieval operations very fast.
 * - Can store duplicate elements and maintains insertion order.

 * Disadvantages of ArrayList:
 * - Insertion and deletion operations (except at the end) can be slow because elements need to be shifted,
 *   resulting in O(n) time complexity.
 * - It is not synchronized by default, meaning it’s not thread-safe for concurrent access in a
 *   multi-threaded environment.
 * - The underlying array may need to be resized, which involves creating a new array and copying elements,
 *   causing performance overhead in certain situations.

 * Consider using LinkedList instead of ArrayList if:
 * - You need frequent insertion and deletion operations, especially in the middle of the list.
 * - You do not require random access to elements.
 */
public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = getStringArrayList();
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.get(3));
        stringArrayList.remove(3);
        System.out.println(stringArrayList);

        stringArrayList.remove("world");
        System.out.println(stringArrayList);

        stringArrayList.set(5, "Hames");
        System.out.println(stringArrayList);

        System.out.println(stringArrayList.contains("cat"));

        for (String string : stringArrayList) {
            System.out.println(string += "a");
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("String at position "+ i +" is: "+stringArrayList.get(i));
        }

        Iterator it = stringArrayList.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator element: " + it.next());
        }
    }

    private static ArrayList<String> getStringArrayList() {
        //initial size = 10; when list exceeds 10, arraylist increases its size : n + n/2 + 1
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("John");
        stringArrayList.add("Jane");
        stringArrayList.add("Jack");
        stringArrayList.add("James");
        stringArrayList.add("Joe");

        stringArrayList.add(2, "Meow");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("cat");

        stringArrayList.addAll(3, strings);
        return stringArrayList;
    }
}
