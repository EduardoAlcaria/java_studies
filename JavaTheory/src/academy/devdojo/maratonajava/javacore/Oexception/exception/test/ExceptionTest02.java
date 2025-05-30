package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    public static void createNewFile() throws IOException {
        File file = new File("arquive\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
