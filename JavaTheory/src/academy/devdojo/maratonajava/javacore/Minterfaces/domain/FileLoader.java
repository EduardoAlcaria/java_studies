package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from the System files");
    }

    @Override
    public void remove() {
        System.out.println("Deleting file data");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the file");
    }

}
