package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "letter A");
        map.put("D", "letter D");
        map.put("C", "letter C  ");
        map.put("E", "letter E");
        map.put("B", "letter B");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println("------------------");
        System.out.println(map);
        System.out.println(map.headMap("C", true));
        System.out.println(map.headMap("C").remove("A"));
        System.out.println(map);
    }


}
