package JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class ClassExerciseCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.Name = "Ford Mustang";
        car1.Model = "Shelby gt500";
        car1.Year = 2024;

        car2.Name = "Ford Mustang";
        car2.Model = "Eleonor";
        car2.Year = 1967;

        System.out.println(car1.Name);
        System.out.println(car1.Model);
        System.out.println(car1.Year);
        System.out.println("------------------------------");
        System.out.println(car2.Name);
        System.out.println(car2.Model);
        System.out.println(car2.Year);
    }
}
