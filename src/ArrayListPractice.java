import java.util.ArrayList;
import java.util.Iterator;

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
