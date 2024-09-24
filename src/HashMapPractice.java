import java.util.HashMap;
import java.util.Map;

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
