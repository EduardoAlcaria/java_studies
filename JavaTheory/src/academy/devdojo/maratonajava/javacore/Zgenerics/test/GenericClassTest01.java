package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.service.RentService;


import java.util.ArrayList;
import java.util.List;

public class GenericClassTest01 {
    public static void main(String[] args) {
        List<Car> carsForRent = new ArrayList<>(List.of(new Car("Mustang"), new Car("GT500")));

        List<Boat> boatsForRent = new ArrayList<>(List.of(new Boat("Boat1"), new Boat("Boat2")));

        RentService<Car> rentServiceCar = new RentService<>(carsForRent);
        RentService<Boat> rentServiceBoat = new RentService<>(boatsForRent);


        Car car = rentServiceCar.retriveAvaliableObjs();

        rentServiceCar.returnRentCar(car);

        Boat boat = rentServiceBoat.retriveAvaliableObjs();

        rentServiceBoat.returnRentCar(boat);


    }

}
