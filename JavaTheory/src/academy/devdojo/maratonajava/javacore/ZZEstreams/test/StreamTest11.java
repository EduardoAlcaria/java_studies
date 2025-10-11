package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("solo leveling", 1),
            new LightNovel("bleach", 2),
            new LightNovel("naruto", 2),
            new LightNovel("dbz", 1),
            new LightNovel("Kagurabachi", 6),
            new LightNovel("Jujutsu Kaisen", 31),
            new LightNovel("Chainsaw man", 6)
    ));
    public static void main(String[] args) {
       lightNovels.stream()
               .map(LightNovel::getPrice)
               .filter(l -> l > 3)
               .reduce(Double::sum)
               .ifPresent(System.out::println);

       lightNovels.stream()
               .map(LightNovel::getPrice)
               .max(Double::compareTo)
               .ifPresent(System.out::println);


       lightNovels.stream()
               .map(LightNovel::getTitle)
               .map(String::toLowerCase)
               .filter(l -> l.endsWith("kaisen"))
               .forEach(System.out::println);


       lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

       lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice).sum();
        System.out.println(sum);

        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        DoubleSummaryStatistics collect2 = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect2);

        OptionalDouble avg = lightNovels.stream().mapToDouble(LightNovel::getPrice).average();
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));


        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);



        String collect1 = lightNovels.stream()
                .map(LightNovel::getTitle)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.joining(", "));

        System.out.println(collect1);

    }

}
