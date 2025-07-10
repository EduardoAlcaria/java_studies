package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileToPathTest01 {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("dir");
        boolean isDirCreated = fileDir.mkdir();

        System.out.println("Is dir created: " + isDirCreated);

        File file = new File(fileDir,"subfile.txt");
        boolean isSubfileCreated = file.createNewFile();
        System.out.println("is subFile Created: "  + isSubfileCreated);

        File renamedFile = new File(fileDir,"renamed_file.txt");
        boolean isFileRenamed = file.renameTo(renamedFile);
        System.out.println("is file renamed: " + isFileRenamed);

        File fileDirRenamed = new File("renamedDir");
        boolean isFileDirRenamed = fileDir.renameTo(fileDirRenamed);

        System.out.println("is dir reanmed: " + isFileDirRenamed);


    }
}
