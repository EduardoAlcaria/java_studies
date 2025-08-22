package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalTest02 {
    private static List<Manga> list = new ArrayList<>(List.of(new Manga(1,"Jujutsu Kaisen"),
            new Manga(2,"Bleach"),
            new Manga(3,"Kagurabachi")));

    public static void main(String[] args) {
        Manga byId = findById(3).orElseThrow(IllegalAccessError::new);
        Optional<Manga> manga = findByTitle("Bleach");
        manga.ifPresent(m -> m.setName("blue lock"));



        System.out.println(byId);
        System.out.println(manga);
    }


    private static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }
    private static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getName().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> tPredicate) {
        Manga found = null;
        for (Manga e : list) {
            if (tPredicate.test(e)){
                found = e;
                return Optional.of(found);
            }
        }
        return Optional.empty();

    }


}
