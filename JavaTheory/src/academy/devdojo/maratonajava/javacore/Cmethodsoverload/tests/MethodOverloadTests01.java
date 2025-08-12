package JavaTheory.src.academy.devdojo.maratonajava.javacore.Cmethodsoverload.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Cmethodsoverload.domain.Anime;

public class MethodOverloadTests01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Jujutsu Kaisen", "TV",47, "Shonen");
        anime.printer();

    }
}
