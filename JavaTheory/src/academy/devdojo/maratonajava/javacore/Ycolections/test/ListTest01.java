package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16); // 1.5 version
        names.add("Eduardo");
        names.add("Alcaria");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------");

        names.add("Lopes");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
