package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise08 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );

        list.stream()
                .mapToDouble(String::length).average().ifPresent(System.out::println);


    }
}
