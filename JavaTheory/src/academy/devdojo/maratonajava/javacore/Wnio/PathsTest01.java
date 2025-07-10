package academy.devdojo.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\linux\\programming\\studies\\java_studies\\JavaTheory\\renamedDir\\renamed_file.txt");
        Path p4 = Paths.get("D:\\linux\\programming\\studies\\java_studies\\JavaTheory\\renamedDir", "renamed_file.txt");
        Path p2 = Paths.get("D:, linux\\programming\\studies\\java_studies\\JavaTheory\\renamedDir\\renamed_file.txt");
        Path p3 = Paths.get("D:", "linux", "programming", "studies", "java_studies", "JavaTheory", "renamedDir" ,"renamed_file.txt" );
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
