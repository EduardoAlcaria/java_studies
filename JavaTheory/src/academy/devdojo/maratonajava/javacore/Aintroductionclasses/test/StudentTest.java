package JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Eduardo";
        student.age = 18;
        student.gen = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gen);
        System.out.println(student);
    }
}
