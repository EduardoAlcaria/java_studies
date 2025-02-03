package academy.devdojo.maratonajava.javacore.Dconstructors.tests;

import academy.devdojo.maratonajava.javacore.Dconstructors.domain.Anime;

public class ConstructorsTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "TV",47, "Shonen");

        Anime anime2 = new Anime();
        anime2.init("Jujutsu Kaisen", "TV",47, "Shonen");

        anime.printer();
        anime2.printer();
    }
}
