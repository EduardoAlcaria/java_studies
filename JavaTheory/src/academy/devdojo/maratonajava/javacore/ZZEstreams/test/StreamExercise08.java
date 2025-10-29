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

        System.out.println("==============================");

        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(String::length));

        System.out.println(collect);

        System.out.println("==============================");


        List<Integer> list3 = new ArrayList<>(
                List.of(-1, 2, 3, 4, 5, 6)
        );


        list3.stream()
                .filter(e -> e%2==0)
                .reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("==============================");

        Stream<String> stringStream = list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .collect(Collectors.joining()).lines();

        stringStream.forEach(System.out::println);

        System.out.println("==============================");

        boolean b = list3.stream()
                .allMatch(e -> e > 0);

        System.out.println(b);
    }
}
