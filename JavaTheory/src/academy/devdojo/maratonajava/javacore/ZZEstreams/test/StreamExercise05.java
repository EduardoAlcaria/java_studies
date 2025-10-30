package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );
        List<String> sorted = list.stream()
                .sorted()
                .toList();

        System.out.println(sorted);





    }


}
