package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
class SortMangaById implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangasSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99));
        mangas.add(new Manga(1L,"Bleach", 9.5));
        mangas.add(new Manga(3L,"Berserk", 3.2));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6));
        mangas.add(new Manga(2L, "Blue Lock", 12.12));



        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        Collections.sort(mangas);
        System.out.println("--------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new SortMangaById());

        System.out.println("--------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
