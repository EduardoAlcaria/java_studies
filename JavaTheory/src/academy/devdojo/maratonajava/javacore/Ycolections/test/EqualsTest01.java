package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Samsung");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");

        System.out.println(s1.equals(s2));

    }
}
