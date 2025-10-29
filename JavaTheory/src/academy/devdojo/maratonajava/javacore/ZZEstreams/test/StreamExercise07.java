package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise07 {
    public static void main(String[] args) {
        System.out.println("==============================");

        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );

        list.stream()
                .reduce((s, e) -> s.length() >= e.length() ? s : e).ifPresent(System.out::println);


        System.out.println("==============================");


    }
}
