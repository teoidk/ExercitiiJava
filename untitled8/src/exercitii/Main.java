package exercitii;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Write a Java program to add a key-value pair in a map

        Map<String, String> map = new HashMap<>();

        map.put("Red", "1");
        map.put("Green", "2");
        map.put("Blue", "3");
        map.put("Yellow", "4");
        map.put("Purple", "5");

        System.out.println(map);

        map.put("Orange", "6");

        System.out.println(map);
    }
}
