package JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Satoru Gojo";
        teacher.age = 29;
        teacher.gen = 'M';
        System.out.println(teacher.name + " " + teacher.age+" "+teacher.gen);
        System.out.println("------------------");
        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.gen);
    }
}
