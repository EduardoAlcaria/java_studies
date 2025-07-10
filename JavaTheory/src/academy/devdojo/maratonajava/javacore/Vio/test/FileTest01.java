package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        File file2 = new File("D:\\linux\\programming\\studies\\java_studies\\JavaTheory\\file2.txt");
        System.out.println(file.createNewFile());
        System.out.println(file2.createNewFile());
    }
}
