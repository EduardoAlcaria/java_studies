package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZBbehavior.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZBbehavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest02 {
    private static List<Car> cars = List.of(
            new Car("Mustang", "black", 2025),
            new Car("GT500", "red", 2024));

    public static void main(String[] args) {

        List<Car> red = filter(car -> car.getColor().equalsIgnoreCase("red"));
        List<Car> black = filterGeneric(cars, car -> car.getColor().equalsIgnoreCase("black"));

        List<Integer> nums = List.of(1,2,3,5,61,677);

        List<Integer> integers = filterGeneric(nums, integer -> integer == 61);

        System.out.println(integers);
        System.out.println(red);
        System.out.println(black);
    }

    private static List<Car> filter(Predicate<Car> tPredicate) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (tPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;

    }

    private static <T> List<T> filterGeneric(List<T> t,Predicate<T> predicate){
        List<T> returnList = new ArrayList<>();
        for (T t1 : t) {
            if (predicate.test(t1)){
                returnList.add(t1);
            }
        }
        return returnList;
    }
}