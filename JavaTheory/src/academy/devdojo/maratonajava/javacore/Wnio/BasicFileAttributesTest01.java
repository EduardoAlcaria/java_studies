package JavaTheory.src.academy.devdojo.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);
        File file = new File("testFile.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        boolean b = file.setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(b);

        Path path = Paths.get("text.txt");
        Files.createFile(path);

        FileTime fileTime = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
    }
}
