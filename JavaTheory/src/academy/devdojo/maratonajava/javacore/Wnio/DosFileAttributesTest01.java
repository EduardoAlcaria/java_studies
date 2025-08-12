package JavaTheory.src.academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        Path folder = Paths.get("folder2");
        if (Files.notExists(folder)){
            Files.createDirectory(folder);
        }


        Path file = Paths.get(folder.toAbsolutePath().toString(),"test2.txt");
        if (Files.notExists(file)){

            Files.createFile(file);

        }

        Files.setAttribute(file, "dos:hidden", true);
        Files.setAttribute(file, "dos:readonly", true);

        Files.setAttribute(file, "dos:hidden", false);
        Files.setAttribute(file, "dos:readonly", false);

        DosFileAttributes dosFileAttributes = Files.readAttributes(file, DosFileAttributes.class);

        System.out.println("is hidden: " + dosFileAttributes.isHidden());
        System.out.println("is read only: " + dosFileAttributes.isReadOnly());


        System.out.println("--------------------------------------------");
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(file, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println("is hidden: " + fileAttributeView.readAttributes().isHidden());
        System.out.println("is read only: " + fileAttributeView.readAttributes().isReadOnly());



    }

}
