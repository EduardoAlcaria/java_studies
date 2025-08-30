package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
