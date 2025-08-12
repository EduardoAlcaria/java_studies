package JavaTheory.src.academy.devdojo.maratonajava.javacore.Jfinalmodifier.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Ferrari;


public class CarTest01 {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Car car = new Car();
        car.setName("Audi");
        System.out.println(car.getName());
        System.out.println(Car.SPEED_LIMIT);


        ferrari.setName("Enzo");
        ferrari.print();


    }
}
