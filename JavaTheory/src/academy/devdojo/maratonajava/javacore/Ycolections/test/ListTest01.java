package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        List<String> names2 = new ArrayList<>(16);
        names.add("Eduardo");
        names.add("Alcaria");

        names2.add("Eduardo");
        names2.add("Lopes");

        names.addAll(names2);

        System.out.println(names);
        System.out.println(names.remove("eduardo"));
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------");

        names.add("Lopes");

        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

    }
}
