package academy.devdojo.maratonajava.javacore.Minterfaces.tests;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataLoader dataLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataLoader.load();
        fileLoader.load();

    }
}
