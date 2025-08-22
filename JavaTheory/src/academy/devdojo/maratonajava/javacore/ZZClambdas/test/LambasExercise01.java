package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambasExercise01 {
    public static void main(String[] args) {
        String string = "Statoru gojo";
        stringSpliter(string, System.out::println);


    }

    private static void stringSpliter(String s, Consumer<String> consumer){
        List<String> stringSplited = List.of(s.split(" "));

        for (String e : stringSplited) {
            consumer.accept(e);
        }

    }
}
