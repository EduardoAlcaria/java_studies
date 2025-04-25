package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in to the Data Base");
    }
}
