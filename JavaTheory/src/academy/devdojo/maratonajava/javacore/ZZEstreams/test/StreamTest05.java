package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Satoru", "aizen", "Itadori", "eu");
        String[] split = words.get(0).split("");
        System.out.println(Arrays.toString(split));

       List<String[]> stream = words.stream().map(l -> l.split("")).collect(Collectors.toList());
        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());


        System.out.println(collect);
    }



}
