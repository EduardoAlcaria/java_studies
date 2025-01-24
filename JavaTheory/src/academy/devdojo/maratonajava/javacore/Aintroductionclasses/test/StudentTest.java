package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.student;

public class StudentTest {
    public static void main(String[] args) {
        student student = new student();
        student.name = "Eduardo";
        student.age = 18;
        student.gen = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gen);
        System.out.println(student);
    }
}
