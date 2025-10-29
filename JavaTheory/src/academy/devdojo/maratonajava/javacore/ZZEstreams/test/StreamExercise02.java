package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
          List.of("Eduardo", "Satoru Gojo")
        );

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
