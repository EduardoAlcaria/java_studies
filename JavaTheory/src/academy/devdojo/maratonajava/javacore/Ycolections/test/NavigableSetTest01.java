package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneBrandComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneBrandComparator());
        Smartphone nokia = new Smartphone("123", "nokia");
        set.add(nokia);

        for (Smartphone smartphone : set) {
            System.out.println(smartphone);
        }


        System.out.println("------------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());

        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99, 0));
        mangas.add(new Manga(1L,"Bleach", 9.5, 5));
        mangas.add(new Manga(3L,"Berserk", 3.2, 3));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6, 2));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga naruto = new Manga(21L, "naruto", 3.2, 5);

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("-----------------");


        System.out.println(mangas.lower(naruto));

        System.out.println(mangas.floor(naruto));

        System.out.println(mangas.higher(naruto));

        System.out.println(mangas.ceiling(naruto));

        System.out.println("-----------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.last());


    }
}
