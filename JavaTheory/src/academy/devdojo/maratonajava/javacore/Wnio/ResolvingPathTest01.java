package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvingPathTest01 {
    public static void main(String[] args) {
        Path abolute = Paths.get("/javaTheory/folder");
        Path relative = Paths.get("subdir/");
        Path file = Paths.get("subsubdir/subFile.txt");

        System.out.println(relative.resolve(abolute));
        System.out.println(abolute.resolve(relative));
        System.out.println(abolute.resolve(file));
    }

}
