package academy.devdojo.maratonajava.javacore.GassociationExercise.Domain;

public class Seminary {
    private String title;
    private Place place;
    private Student[] students;
    private Professor professor;

    public Seminary(String title) {
        this.title = title;
    }

    public Seminary(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminary(String title, Place place, Student[] students, Professor professor) {
        this.title = title;
        this.place = place;
        this.students = students;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
