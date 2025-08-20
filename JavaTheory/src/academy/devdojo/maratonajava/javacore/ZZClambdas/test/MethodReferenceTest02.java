package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("jujutsu kaisen", 55), new Anime("blue lock", 33)));
        AnimeComparator animeComparator = new AnimeComparator();

        animes.sort(animeComparator::compareByEpisodesNonStatic );
        animes.sort((a1, a2) -> animeComparator.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animes);
    }


}