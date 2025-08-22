package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamTest01 {
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


        lightNovels.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(lightNovels);

        System.out.println("--------------------------");

        List<String> retrived = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() < 4) {
                retrived.add(lightNovel.getTitle());
            }
        }

        System.out.println(retrived);

}

}
