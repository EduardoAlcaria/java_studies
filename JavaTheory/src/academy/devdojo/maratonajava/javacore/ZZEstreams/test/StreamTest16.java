package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreamIterateParalel(num);
        sumStreamLongIterateParalel(num);
    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num ; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, n -> n + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void sumStreamIterateParalel(long num){
        System.out.println("sumStreamIterateParalel");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, n -> n + 1).limit(num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void sumStreamLongIterateParalel(long num){
        System.out.println("sumStreamLongIterateParalel");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

}
