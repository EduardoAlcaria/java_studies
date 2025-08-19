package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZBbehavior.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {
    private static List<Car> cars = List.of(
            new Car("Mustang", "black", 2025),
            new Car("GT500", "red", 2024));
    public static void main(String[] args) {


        System.out.println("-----------------");

        List<Car> cars1 = filterByColor("red");

        System.out.println(cars1);

        System.out.println("-----------------");

        List<Car> cars2 = filterByAge(2025);

        System.out.println(cars2);
    }
    private static List<Car> filterByColor(String color){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;


    }
    private static List<Car> filterByAge(int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filteredCars.add(car);
            }
        }
        return filteredCars;


    }

}
