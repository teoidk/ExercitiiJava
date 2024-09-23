import java.util.HashMap;

public class Ex4 {
    public static void main(String[] args) {
        //4. Create a HashMap<Integer, String> and add the following key-value
        // pairs: 1 -> "One ", 2 -> "Two", 3 -> "Three". Then, print the map.

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println(hashMap);
    }
}
