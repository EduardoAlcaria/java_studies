package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.test;


import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("eduardo");


        for (String s : list) {
            System.out.println(s);
        }

        add(list, new Consumer("Satoru"));

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static void add(List list, Consumer consumer){
        list.add(consumer);
    }
}
