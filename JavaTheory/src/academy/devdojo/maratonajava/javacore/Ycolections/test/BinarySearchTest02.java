package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        SortMangaById sortMangaById = new SortMangaById();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99));
        mangas.add(new Manga(1L,"Bleach", 9.5));
        mangas.add(new Manga(3L,"Berserk", 3.2));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6));
        mangas.add(new Manga(2L, "Blue Lock", 12.12));

        //Collections.sort(mangas);
        mangas.sort(sortMangaById);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(5L,"Jujusu Kaisen", 19.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, sortMangaById));


    }
}
