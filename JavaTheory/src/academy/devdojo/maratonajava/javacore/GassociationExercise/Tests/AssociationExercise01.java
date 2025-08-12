package JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Place;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Professor;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Seminary;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Student;

public class AssociationExercise01 {
    public static void main(String[] args) {
        Student student1 = new Student("Itadori", 16);


        Student[] studentsSeminary = {student1};

        Place place1 = new Place("1st street");

        Professor professor1 = new Professor("Gojo Satoru", "cursed techniques");

        Seminary seminary1 = new Seminary("How to exorcise cursed spirits", place1, studentsSeminary, professor1);


        Seminary[] seminaries = {seminary1};

        student1.setSeminary(seminary1);

        seminary1.setStudents(studentsSeminary);

        professor1.setSeminaries(seminaries);

        professor1.print();

    }
}
