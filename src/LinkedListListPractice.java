import java.util.Iterator;
import java.util.LinkedList;

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
