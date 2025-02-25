package academy.devdojo.maratonajava.javacore.GassociationExercise.Tests;

import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Place;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Professor;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Seminary;
import academy.devdojo.maratonajava.javacore.GassociationExercise.Domain.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssociationExercise01Tests {

    @Test
    void testStudentSeminaryAssociation() {
        Place place = new Place("Tokyo Jujutsu High");
        Student student = new Student("Yuta Okkotsu", 17);
        Seminary seminary = new Seminary("Advanced Cursed Techniques", place);

        student.setSeminary(seminary);

        assertNotNull(student.getSeminary());
        assertEquals("Advanced Cursed Techniques", student.getSeminary().getTitle());
        assertEquals("Tokyo Jujutsu High", student.getSeminary().getPlace().getAddress());
    }

    @Test
    void testSeminaryWithoutProfessor() {
        Seminary seminary = new Seminary("Introduction to Jujutsu", new Place("Tokyo Jujutsu High"));

        assertNull(seminary.getProfessor(), "Seminary should not have a professor initially.");
    }

    @Test
    void testPlaceAddressUpdate() {
        Place place = new Place("Old Address");
        place.setAddress("New Address");

        assertEquals("New Address", place.getAddress());
    }

    @Test
    void testSeminaryStudentsAssociation() {
        Student student1 = new Student("Itadori", 16);
        Student student2 = new Student("Megumi", 15);
        Student[] students = {student1, student2};

        Seminary seminary = new Seminary("Cursed Energy Basics", new Place("Training Ground"), students, null);

        assertEquals(2, seminary.getStudents().length);
        assertEquals("Itadori", seminary.getStudents()[0].getName());
        assertEquals("Megumi", seminary.getStudents()[1].getName());
    }

    @Test
    void testProfessorWithNoSeminaries() {
        Professor professor = new Professor("Nanami Kento", "Ratio Techniques");

        assertNull(professor.getSeminaries(), "Professor should have no seminaries initially.");
    }

    @Test
    void testAddingSeminariesToProfessor() {
        Place place1 = new Place("Tokyo Jujutsu High");
        Place place2 = new Place("Training Ground");
        Professor professor = new Professor("Gojo Satoru", "Cursed Techniques");
        Seminary seminary1 = new Seminary("How to use Limitless", place1);
        Seminary seminary2 = new Seminary("Mastering Purple Hollow", place2);

        Seminary[] seminaries = {seminary1, seminary2};
        professor.setSeminaries(seminaries);

        assertNotNull(professor.getSeminaries());
        assertEquals(2, professor.getSeminaries().length);
        assertEquals("How to use Limitless", professor.getSeminaries()[0].getTitle());
        assertEquals("Mastering Purple Hollow", professor.getSeminaries()[1].getTitle());
    }

    @Test
    void testStudentCanOnlyBeInOneSeminary() {
        Student student = new Student("Yuji Itadori", 16);
        Seminary seminary1 = new Seminary("Cursed Energy Basics", new Place("Tokyo Jujutsu High"));
        Seminary seminary2 = new Seminary("Domain Expansion Mastery", new Place("Kyoto School"));

        student.setSeminary(seminary1);
        student.setSeminary(seminary2); // Overwriting the first assignment

        assertEquals("Domain Expansion Mastery", student.getSeminary().getTitle(),
                "Student should only be associated with the last assigned seminary.");
    }

    @Test
    void testSeminaryCanHaveMultipleStudents() {
        Student student1 = new Student("Itadori", 16);
        Student student2 = new Student("Megumi", 15);
        Student student3 = new Student("Nobara", 16);
        Student[] students = {student1, student2, student3};

        Seminary seminary = new Seminary("Jujutsu Combat Training", new Place("Tokyo Jujutsu High"));
        seminary.setStudents(students);

        assertEquals(3, seminary.getStudents().length, "Seminary should have 3 students.");
    }

    @Test
    void testSeminaryCanHaveNoStudents() {
        Seminary seminary = new Seminary("Solo Training", new Place("Abandoned Warehouse"));

        assertNull(seminary.getStudents(), "Seminary should have no students if not assigned.");
    }

    @Test
    void testProfessorCanHaveMultipleSeminaries() {
        Professor professor = new Professor("Gojo Satoru", "Cursed Techniques");
        Seminary seminary1 = new Seminary("Infinity Basics", new Place("Tokyo Jujutsu High"));
        Seminary seminary2 = new Seminary("How to use Hollow Purple", new Place("Gojo’s Hideout"));

        Seminary[] seminaries = {seminary1, seminary2};
        professor.setSeminaries(seminaries);

        assertEquals(2, professor.getSeminaries().length, "Professor should be hosting two seminaries.");
    }

    @Test
    void testSeminaryAlwaysHasAPlace() {
        Place place = new Place("Training Grounds");
        Seminary seminary = new Seminary("Hand-to-Hand Combat", place);

        assertNotNull(seminary.getPlace(), "Seminary must have a location.");
        assertEquals("Training Grounds", seminary.getPlace().getAddress());
    }
}
