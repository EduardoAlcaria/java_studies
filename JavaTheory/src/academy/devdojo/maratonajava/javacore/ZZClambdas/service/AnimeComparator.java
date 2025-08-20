package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;

import java.util.List;

public class AnimeComparator {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getName().compareTo(a2.getName());
    }
    public static int compareByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
    public int compareByEpisodesNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
