package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.repository.Repository;

public class RepositoryMemory implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in to the Memory");
    }
}
