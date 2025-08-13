package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Consumer;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer c1 = new Consumer("Eduardo");
        Consumer c2 = new Consumer("Satoru");

        Manga jujusuKaisen = new Manga(5L, "Jujusu Kaisen", 19.99);
        Manga bleach = new Manga(1L, "Bleach", 9.5);
        Manga berserk = new Manga(3L, "Berserk", 3.2);
        Manga shumatsuNoValkyyre = new Manga(4L, "Shumatsu no Valkyyre", 12.6);
        Manga blueLock = new Manga(2L, "Blue Lock", 12.12);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(c1, jujusuKaisen);
        consumerMangaMap.put(c2, bleach);

        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() + " | " + entry.getValue().getTitle());
        }
    }
}
