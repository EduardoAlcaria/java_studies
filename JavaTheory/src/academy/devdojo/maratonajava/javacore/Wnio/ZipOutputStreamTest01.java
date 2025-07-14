package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("folder2/file.zip");
        Path zipFiles = Paths.get("folder2/subfolder");
        zip(zipFile, zipFiles);
    }
    private static void zip(Path zipDir, Path toZip){
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipDir));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(toZip)){

            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
            System.out.println("File created");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
