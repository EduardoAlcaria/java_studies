package academy.devdojo.maratonajava.javacore.Jfinalmodifier.tests;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Audi");
        System.out.println(Car.SPEED_LIMIT);
    }
}
