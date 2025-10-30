package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;

import java.util.List;


public class StreamExercise10 {
    public static void main(String[] args) {



        List<Integer> list3 = new ArrayList<>(
                List.of(-1, 2, 3, 4, 5, 6)
        );


        list3.stream()
                .filter(e -> e%2==0)
                .reduce(Integer::sum).ifPresent(System.out::println);




    }
}
