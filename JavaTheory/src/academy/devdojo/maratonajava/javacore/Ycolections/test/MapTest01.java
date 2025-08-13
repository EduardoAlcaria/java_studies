package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //Map<String, String> map = new LinkedHashMap<>();
        map.put("user", "eduardo");
        map.put("vc", "you");
        map.putIfAbsent("vc2", "you");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " | " + map.get(key));
        }

    }
}
