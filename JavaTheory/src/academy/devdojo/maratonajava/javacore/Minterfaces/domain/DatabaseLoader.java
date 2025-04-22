package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Data from the Database");
    }

    @Override
    public void remove() {
        System.out.println("Truncating tables from the DataBase");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the database");
    }
}
