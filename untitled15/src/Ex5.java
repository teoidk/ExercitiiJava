import java.util.HashMap;
import java.util.Map;

public class Ex5 {

    public static Integer getValueForKey(Map<String, Integer> hashMap, String key) {
        Integer i = hashMap.get(key);
        if (i == null) {
            System.out.println("The value does not exist in the Map,returning -1");
            return -1;
        } else {
            return i;
        }
    }
    public static void main(String[] args) {
        //5. Given a HashMap<String, Integer> containing {"A" -> 10, "B" -> 20,
        // "C" -> 30}, write a method to get the value associated with the key "B"
        // and print it.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);

        String key = "B";
        Integer value = getValueForKey(hashMap,key);
        System.out.println(value.toString());
    }

}
