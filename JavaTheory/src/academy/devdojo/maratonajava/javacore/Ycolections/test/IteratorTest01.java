package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class SortMangaCharged implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
       return o1.getTitle().compareTo(o2.getTitle());
    }
}

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99, 0));
        mangas.add(new Manga(1L,"Bleach", 9.5, 5));
        mangas.add(new Manga(3L,"Berserk", 3.2, 0));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6, 2));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));

        mangas.sort(new SortMangaCharged());

        Iterator<Manga> iterator = mangas.iterator();

//
//        while(iterator.hasNext()){
//            Manga next = iterator.next();
//            if (next.getQuantity() == 0){
//                iterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
