package academy.devdojo.maratonajava.javacore.Fstaticmodifier.tests;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class StaticModifiersTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 275);
        Car car3 = new Car("Audi", 290);

        Car.speedLimit = 180;

        car1.print();
        car2.print();
        car3.print();
    }
}
