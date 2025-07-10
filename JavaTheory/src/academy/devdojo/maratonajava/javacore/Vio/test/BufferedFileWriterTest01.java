package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterTest01 {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("file2.txt",true)){
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("kaiser impact");
            bfw.newLine();
            bfw.write("bankai");
            bfw.newLine();
            bfw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
