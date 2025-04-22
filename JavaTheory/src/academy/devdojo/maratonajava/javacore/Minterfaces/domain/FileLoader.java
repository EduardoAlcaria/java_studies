package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data from the System files");
    }
}
