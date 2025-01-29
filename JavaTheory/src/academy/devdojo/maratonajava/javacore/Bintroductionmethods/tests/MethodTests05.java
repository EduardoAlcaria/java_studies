package academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class MethodTests05 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "zaraki";
        student01.age = 50;
        student01.gen = 'M';

        student02.name = "Aizen";
        student02.age = 35;
        student02.gen = 'M';

        student01.print();
        student02.print();
    }

}
