package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("dir/renamed_file.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creation time " + creationTime);
        System.out.println("last modified time  " + lastModifiedTime);
        System.out.println("last access time " + lastAccessTime);

        System.out.println("---------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());

        fileAttributeView.setTimes(lastModifiedTime, fileTime, creationTime);

        System.out.println("creating time " + fileAttributeView.readAttributes().creationTime());
        System.out.println("last modified time " + fileAttributeView.readAttributes().lastModifiedTime());
        System.out.println("last access time " + fileAttributeView.readAttributes().lastAccessTime());

    }
}
