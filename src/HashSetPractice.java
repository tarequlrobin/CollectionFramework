import java.util.HashSet;
import java.util.Set;

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
