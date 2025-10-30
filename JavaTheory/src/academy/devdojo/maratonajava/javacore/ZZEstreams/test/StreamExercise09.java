package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExercise09 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );



        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(String::length));

        System.out.println(collect);


    }
}
