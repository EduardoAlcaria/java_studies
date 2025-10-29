package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        );

        List<Integer> list1 = list.stream()
                .map(s -> s*s)
                .toList();

        System.out.println(list1);
    }

}
