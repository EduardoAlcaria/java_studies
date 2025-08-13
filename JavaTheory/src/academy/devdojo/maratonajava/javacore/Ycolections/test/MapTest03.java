package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Consumer;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer c1 = new Consumer("Eduardo");
        Consumer c2 = new Consumer("Satoru");

        Manga jujusuKaisen = new Manga(5L, "Jujusu Kaisen", 19.99);
        Manga bleach = new Manga(1L, "Bleach", 9.5);
        Manga berserk = new Manga(3L, "Berserk", 3.2);
        Manga shumatsuNoValkyyre = new Manga(4L, "Shumatsu no Valkyyre", 12.6);
        Manga blueLock = new Manga(2L, "Blue Lock", 12.12);

        List<Manga> mangaListConsumer1 = List.of(jujusuKaisen, bleach, berserk);

        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();

        consumerMangaMap.put(c1, mangaListConsumer1);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println(" - " + manga.getTitle());
            }

        }


    }
}
