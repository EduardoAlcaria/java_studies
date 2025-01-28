package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class PrintStudent {
    public void print(Student student) {
        System.out.println("---------------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gen);
    }
}

