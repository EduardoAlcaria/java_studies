package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                        .count();
        System.out.println(count);


    }


}
