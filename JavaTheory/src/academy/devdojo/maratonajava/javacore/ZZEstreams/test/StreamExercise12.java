package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise12 {
    public static void main(String[] args) {


        List<Integer> list3 = new ArrayList<>(
                List.of(-1, 2, 3, 4, 5, 6)
        );

        System.out.println("==============================");

        boolean b = list3.stream()
                .allMatch(e -> e > 0);

        System.out.println(b);
    }
}
