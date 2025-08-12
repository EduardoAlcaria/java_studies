package JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Tests;

import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Place;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Professor;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Seminary;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Student;

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
