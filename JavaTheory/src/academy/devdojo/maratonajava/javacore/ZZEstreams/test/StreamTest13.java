package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.Category;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.LightNovel;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZEstreams.demon.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.*;

public class StreamTest13 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.PROMOTION));


        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        (Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.PROMOTION))));

        System.out.println(collect2);

        DoubleSummaryStatistics collect1 = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect1);

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        System.out.println(lightNovels);



    }
}
