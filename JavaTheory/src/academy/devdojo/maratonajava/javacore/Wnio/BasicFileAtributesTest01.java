package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);
        File file = new File("testFile.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        boolean b = file.setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(b);

    }
}
