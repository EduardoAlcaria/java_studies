package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        File file2 = new File("D:\\linux\\programming\\studies\\java_studies\\JavaTheory\\file2.txt");
        try {
            System.out.println("isCreatedFile1: " + file.createNewFile());
            System.out.println("isCreatedFile2: " + file2.createNewFile());

            System.out.println("path1" + file.getAbsolutePath());
            System.out.println("Path2" + file2.getAbsolutePath());

            System.out.println("does file1 exists: " + file.exists());
            System.out.println("does file2 exists: " + file2.exists());

            System.out.println("does file could be deleted: " + file2.delete());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
