package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.*;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("jujutsu kaisen", 55), new Anime("blue lock", 33)));
//        Collections.sort(anime, (a1, a2) -> a1.getName().compareTo(a2.getName()));
//        Collections.sort(anime,AnimeComparator::compareByTitle);
        Collections.sort(anime, AnimeComparator::compareByEpisodes);
        System.out.println(anime);

    }
}