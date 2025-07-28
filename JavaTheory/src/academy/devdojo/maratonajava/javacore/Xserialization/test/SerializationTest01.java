package JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.domain.Class;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.domain.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "Itadori", "itadori123");
        Class aclass = new Class("Java course");
        student.setaClass(aclass);
        serialize(student);
        deserialize();
    }

    private static void serialize(Student student){
        Path path = Paths.get("JavaTheory/src/academy/devdojo/maratonajava/javacore/Xserialization/output/student.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(student);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserialize(){
        Path path = Paths.get("JavaTheory/src/academy/devdojo/maratonajava/javacore/Xserialization/output/student.ser");
        try (ObjectInputStream oss = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) oss.readObject();
            System.out.println(student);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
