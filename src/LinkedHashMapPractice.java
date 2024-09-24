import java.util.LinkedHashMap;
import java.util.Map;

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
    }
}
