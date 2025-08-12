package JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.PrintStudent;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class MethodTests04 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        PrintStudent printStudent = new PrintStudent();
        student1.name = "Aizen";
        student1.age = 35;
        student1.gen = 'M';

        student2.name = "kenpas";
        student2.age = 45;
        student2.gen = 'M';
        printStudent.print(student1);
        printStudent.print(student2);

    }
}
