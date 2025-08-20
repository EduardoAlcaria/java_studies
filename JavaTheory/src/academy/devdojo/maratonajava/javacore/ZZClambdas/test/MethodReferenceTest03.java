package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<>(List.of("Satoru", "Gojo", "Aizen"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> numStringToInteger = Integer::parseInt;

        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;

        System.out.println(checkName.test(names,"Aizen"));

    }

}