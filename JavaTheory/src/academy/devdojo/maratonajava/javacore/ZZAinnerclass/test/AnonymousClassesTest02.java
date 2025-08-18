package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZAinnerclass.test;


import JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>();
        boatList.add(new Boat("joat"));
        boatList.add(new Boat("betsky"));

        boatList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(boatList);

        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boatList);

    }
}
