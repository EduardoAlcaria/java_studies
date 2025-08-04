package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Samsung");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Xiaomi");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        smartphones.addFirst(s3);


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("33333", "Xiaomi");

        System.out.println(smartphones.contains(s4));

        int pixelIndex = smartphones.indexOf(s4);

        System.out.println(pixelIndex);
        System.out.println(smartphones.get(pixelIndex));
    }
}
