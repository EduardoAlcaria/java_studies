package JavaTheory.src.academy.devdojo.maratonajava.javacore.Dconstructors.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Dconstructors.domain.Anime;

public class ConstructorsTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "TV","shonen", "mappa", 47 );
        anime.printer();
    }
}
