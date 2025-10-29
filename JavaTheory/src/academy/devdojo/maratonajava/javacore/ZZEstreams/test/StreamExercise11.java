package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise11 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );



        Stream<String> stringStream = list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .collect(Collectors.joining()).lines();

        stringStream.forEach(System.out::println);


    }
}
