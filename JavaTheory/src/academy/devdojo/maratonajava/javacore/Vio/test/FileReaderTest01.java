package academy.devdojo.maratonajava.javacore.Vio.test;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file1.txt")){
//            char[] chars = new char[100];
//            reader.read(chars);

//            for (char aChar : chars) {
//                System.out.println(aChar);
//            }


            int i;
            while ((i = reader.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
