package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99, 0));
        mangas.add(new Manga(1L,"Bleach", 9.5, 5));
        mangas.add(new Manga(3L,"Berserk", 3.2, 0));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6, 2));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
