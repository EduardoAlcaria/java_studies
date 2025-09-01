package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) throws IOException {
        IntStream.rangeClosed(1, 50).filter(num -> num % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(num -> num % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();


        Stream.of("what is up ", "you will", " wimp out?" )
                .map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();

        int[] nums = {1, 2, 3, 4};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("fileTest.txt"))){
            lines.map(String::toLowerCase)
                    .filter(l -> l.contains("java"))
                    .forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
