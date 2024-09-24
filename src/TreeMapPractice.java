import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        //sorts according to key order
        map.put("ta", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        System.out.println(map);
    }
}
