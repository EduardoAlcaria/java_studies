package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );

        list.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
