package academy.devdojo.maratonajava.javacore.Jfinalmodifier.tests;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;

import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Audi");
        System.out.println(car.getName());
        System.out.println(Car.SPEED_LIMIT);
    }
}
