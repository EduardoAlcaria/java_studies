package JavaTheory.src.academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args){

        try (FileWriter writer = new FileWriter("file1.txt", true)){
            writer.write("Bankai\n");
            writer.flush();

        }catch (IOException ioException){
            throw new RuntimeException();
        }

    }
}
