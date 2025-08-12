package JavaTheory.src.academy.devdojo.maratonajava.javacore.Fstaticmodifier.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class StaticModifiersTest01 {
    public static void main(String[] args) {

        Car.setSpeedLimit(180);

        Car car1 = new Car("Audi", 190);
        Car car2 = new Car("BMW", 300);
        Car car3 = new Car("Mercedes", 310);


        car1.print();
        car2.print();
        car3.print();
    }
}
