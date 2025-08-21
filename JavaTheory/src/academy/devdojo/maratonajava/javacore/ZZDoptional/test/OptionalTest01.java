package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Eduardo");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println("--------------");


        Optional<String> nameOptional = findName("Eduardo");
        nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

        System.out.println(nameOptional);
    }

    private static Optional<String> findName(String name){
        List<String> list = new ArrayList<>(List.of("Eduardo", "Satoru Gojo", "Aizen"));
        list.sort(String::compareTo);

        System.out.println(list);
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
