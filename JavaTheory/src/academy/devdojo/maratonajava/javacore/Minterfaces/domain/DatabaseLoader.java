package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading Data from the Database");
    }
}
