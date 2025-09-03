package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.Category;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static ArrayList<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("solo leveling", 1, Category.SHONEN),
            new LightNovel("bleach", 2, Category.FANTASY),
            new LightNovel("naruto", 2, Category.POWER_FANTASY),
            new LightNovel("dbz", 1, Category.POWER_FANTASY),
            new LightNovel("kagurabachi", 6, Category.POWER_FANTASY),
            new LightNovel("jujutsu Kaisen", 31, Category.POWER_FANTASY),
            new LightNovel("chainsaw man", 6, Category.POWER_FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect =
                lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);


        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect3);


    }
}
