package academy.devdojo.maratonajava.javacore.Einitializationblocks.tests;

import academy.devdojo.maratonajava.javacore.Einitializationblocks.domain.Anime;

public class InitializationBlocksTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one piece");
        for (int episode : anime.getEpisodes())
            System.out.print(episode + " ");
    }
}
