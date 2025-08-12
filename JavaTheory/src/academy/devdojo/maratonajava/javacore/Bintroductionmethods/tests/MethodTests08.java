package JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.People;

public class MethodTests08 {
    public static void main(String[] args) {
        People people = new People();
        people.setName("itadori");
        people.setAge(16);
        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}