package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("jujutsu kaisen", 55), new Anime("blue lock", 33)));

        Collections.sort(animes, AnimeComparator::compareByEpisodes);
        animes.sort(animeComparator::compareByEpisodesNonStatic);

        BiFunction<String, Integer, Anime> animeBiFunction = (s, n) -> new Anime(s, n);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;

        Anime blueLock = animeBiFunction.apply("Blue Lock", 32);
        Anime jujutsuKaisen = animeBiFunction1.apply("Jujutsu Kaisen", 40);

        System.out.println(animes);

        System.out.println(blueLock);
        System.out.println(jujutsuKaisen);

        Function<String, Integer> parseInt = Integer::parseInt;
        Integer apply = parseInt.apply("10");

        System.out.println(apply);


        animes.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        System.out.println(animes);
        animes.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animes);

        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;

        AnimeComparator animeComparator1 = animeComparatorSupplier.get();


        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        Anime blueLock2 = animeBiFunction2.apply("blue lock", 44);

        BiFunction<String, Integer, Anime> animeBiFunction3 = (name, eps) -> new Anime(name, eps);

        Anime blueLock1 = animeBiFunction3.apply("blue lock", 35);
        
    }
}
