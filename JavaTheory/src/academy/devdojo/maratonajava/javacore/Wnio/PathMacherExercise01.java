package JavaTheory.src.academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class GetAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        boolean isMatch = getFiles(file);
        if (isMatch){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }


    public static boolean getFiles(Path file){
        String glob = "glob:*{Test*}.{java,class}";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        if (matcher.matches(file.getFileName())){
            return true;
        }
        return false;

    }
}


public class PathMacherExercise01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        Files.walkFileTree(path, new GetAllFiles());
    }
}
