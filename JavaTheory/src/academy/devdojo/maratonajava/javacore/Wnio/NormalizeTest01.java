package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String path =  "folder/subdir";
        String file =  "/../subsubdir/subFile.txt";
        Path completePath = Paths.get(path, file);
        System.out.println(completePath);
        System.out.println(completePath.normalize());

    }
}
