package JavaTheory.src.academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathsTest01 {
    public static void main(String[] args) {
        Path abolute = Paths.get("/javaTheory/folder");
        Path file = Paths.get("/javaTheory/folder/subdir/subsubdir/subFile.txt");

        System.out.println(abolute.relativize(file));
    }
}
