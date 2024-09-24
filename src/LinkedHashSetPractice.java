import java.util.LinkedHashSet;
import java.util.Set;

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
