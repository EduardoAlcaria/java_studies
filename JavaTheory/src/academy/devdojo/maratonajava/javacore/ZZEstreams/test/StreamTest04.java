package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> gfxDesigners = List.of("someone", "someone2");
        List<String> devs = List.of("eduardo", "lucas");
        List<String> students = List.of("itadori", "ichigo");

        String letters = "a, b, c, d";

        devdojo.add(gfxDesigners);
        devdojo.add(devs);
        devdojo.add(students);

       devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);



    }
}
