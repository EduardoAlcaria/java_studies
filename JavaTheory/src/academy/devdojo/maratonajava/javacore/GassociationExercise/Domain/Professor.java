package JavaTheory.src.academy.devdojo.maratonajava.javacore.GassociationExercise.Domain;

public class Professor {
    private String professorName;
    private String speciality;
    private Seminary[] seminaries;
    private Student student;

    public Professor(String professorName, String speciality) {
        this.professorName = professorName;
        this.speciality = speciality;
    }

    public void print() {
        System.out.println("Seminary host: " + this.professorName);
        System.out.println("Host speciality: " + this.speciality);
        if (seminaries == null) {
            return;
        }
        for (Seminary seminary : seminaries) {
            System.out.println("Seminary title: " + seminary.getTitle() + " || " + " Seminary Address: " + seminary.getPlace().getAddress());
            if (seminary.getStudents() == null || seminary.getStudents().length == 0) {
                continue;
            }
            for (Student student : seminary.getStudents()) {
                System.out.println("    Seminary student " + student.getName() + " || Student age: " + student.getAge());
            }

        }
    }


    public Seminary[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminary[] seminaries) {
        this.seminaries = seminaries;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}