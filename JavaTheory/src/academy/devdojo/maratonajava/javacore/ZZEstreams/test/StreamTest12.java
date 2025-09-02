package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.Category;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("solo leveling", 1, Category.POWER_FANTASY),
            new LightNovel("bleach", 2, Category.SHONEN),
            new LightNovel("naruto", 2, Category.SHONEN),
            new LightNovel("dbz", 1, Category.SHONEN)
    ));
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();


        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));

        collect
                .forEach(
                        (category, lightNovels1) -> System.out.println(category + ": " + lightNovels1.stream().map(LightNovel::getTitle).toList()));


    }
}
