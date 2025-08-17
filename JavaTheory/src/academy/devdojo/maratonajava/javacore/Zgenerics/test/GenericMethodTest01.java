package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> coolBoat = createArrayWithObj(new Boat("Cool Boat"));
        System.out.println(coolBoat);
    }

    private static <T> List<T> createArrayWithObj(T t){
        return List.of(t);
    }

}

