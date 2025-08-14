package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;


import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        mangas.add(new Manga(5L,"Jujusu Kaisen", 19.99, 0));
        mangas.add(new Manga(1L,"Bleach", 9.5, 5));
        mangas.add(new Manga(3L,"Berserk", 3.2, 3));
        mangas.add(new Manga(4L, "Shumatsu no Valkyyre", 12.6, 2));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));
        mangas.add(new Manga(2L, "Blue Lock", 12.12, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

        System.out.println(mangas);
    }
}
