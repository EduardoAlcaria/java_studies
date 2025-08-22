package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(List.of(new Manga(1,"Jujutsu Kaisen"),
                new Manga(2,"Bleach"),
                new Manga(3,"Kagurabachi")));

        findMangaByName(mangas, new Manga(3, "Banki"));

        mangas.sort(Manga::sortByName);
        System.out.println(mangas);

        System.out.println(findMangaById(mangas,3));


    }

    private static Optional findMangaByName(List<Manga> mangas, Manga manga) {
        int i = mangas.indexOf(manga);
        if (i != -1){
            Manga manga1 = mangas.get(i);
            manga1.setName("Blue Lock");
            return Optional.of(mangas);
        }

        if (i == -1){
            return Optional.of(mangas.add(new Manga(4, "Blue Lock")));


        }
        return Optional.empty();
    }

    private static Optional findMangaById(List<Manga> mangas, int id){
        for (Manga manga : mangas) {
            if (manga.getId() == id){
                return Optional.of(true);
            }
        }
        throw new RuntimeException("ID not found");

    }



}
