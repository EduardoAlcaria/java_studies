package JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.repository.Repository;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.services.RepositoryDataBase;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();

        List<String> list = new ArrayList<>();
        list.add("Itadori");
        list.add("Gojo");
        System.out.println(list);

    }
}
