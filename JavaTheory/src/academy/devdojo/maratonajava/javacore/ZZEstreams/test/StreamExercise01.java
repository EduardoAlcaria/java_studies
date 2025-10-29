package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6)
        );

        list.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);
    }

}
