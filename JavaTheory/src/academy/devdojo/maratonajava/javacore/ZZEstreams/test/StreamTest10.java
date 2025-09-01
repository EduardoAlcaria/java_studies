package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("----------------------");

        System.out.println();

        int[] integer = new int[10];
        for (int i = 1; i < 10; i++) {
            if (i < 2){
                integer[0] = 0;
                integer[1] = 1;
                System.out.println(integer[0]);
                System.out.println(integer[1]);
            }

            if (i >= 2){
                integer[i] = integer[i-2] + integer[i-1];
                System.out.println(integer[i]);
            }

        }

        System.out.println("--------------------------");

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("--------------------------");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(10)
                .forEach(System.out::println);
    }
}
