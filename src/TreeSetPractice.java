import java.util.Set;
import java.util.TreeSet;

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
