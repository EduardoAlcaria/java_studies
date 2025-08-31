package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((x, y) -> x  + y)
                .ifPresent(System.out::println);


        Optional<Integer> reduce = integers.stream().reduce(Integer::sum);
        System.out.println(reduce.get());


        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(Integer::max));
        System.out.println(integers.stream().reduce(10, Integer::max));


    }
}

