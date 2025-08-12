package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Jujusu Kaisen");
        mangas.add("Bleach");
        mangas.add("Berserk");
        mangas.add("Shumatsu no Valkyyre");
        mangas.add("Blue Lock");

        for (String s : mangas) {
            System.out.println("index " + mangas.indexOf(s) + " of " + s);
        }

        Collections.sort(mangas);

        System.out.println("---------------------");

        for (String s : mangas) {
            System.out.println("index " + mangas.indexOf(s) + " of " + s);
        }

        List<Double> money = new ArrayList<>();
        money.add(100.3);
        money.add(512.3);
        money.add(21.3);
        money.add(25.3);
        money.add(535.3);

        Collections.sort(money);
        Collections.sort(mangas);

        System.out.println(money);



    }
}
