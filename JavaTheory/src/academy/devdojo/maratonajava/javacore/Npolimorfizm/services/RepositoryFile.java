package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("saving into a file");
    }
}
