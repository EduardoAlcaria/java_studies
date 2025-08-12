package JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain.School;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain.Teacher;

public class AssociationTest03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("satoru gojo");
        Teacher teacher1 = new Teacher("Nanami");

        Teacher[] teachers = {teacher, teacher1};

        School school = new School("Jujutsu tech", teachers);

        school.print();

    }
}
