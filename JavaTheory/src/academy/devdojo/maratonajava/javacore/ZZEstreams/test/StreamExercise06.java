package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise06 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(
                List.of("Gojo", "Gojo", "Aizen", "Eduardo")
        );


        list1.stream()
                .distinct()
                .forEach(System.out::println);




    }
}
