package JavaTheory.src.academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathsTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder");
        if (Files.notExists(path)){
            Path path1 = Files.createDirectory(path);
        }

        Path subDirPath = Paths.get("folder\\subdir\\subsubdir");
        Path subDir = Files.createDirectories(subDirPath);
        Path filePath = Paths.get(subDirPath.toString(), "subFile.txt");

        if (Files.notExists(filePath)){
            Path filePath1 = Files.createFile(filePath);
        }


        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamedSubFile.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


    }
}
