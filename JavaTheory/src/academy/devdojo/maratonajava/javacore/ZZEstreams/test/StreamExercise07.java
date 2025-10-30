package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;

import java.util.List;


public class StreamExercise07 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(
                List.of("Buda", "Gojo", "Aizen", "Eduardo")
        );

        list.stream()
                .reduce((s, e) -> s.length() >= e.length() ? s : e).ifPresent(System.out::println);




    }
}
