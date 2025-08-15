package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printAppointment(cats);
        printAppointment(dogs);

        List<Animal> animals = new ArrayList<>();
        printAppointment(animals);


    }

    private static void printAppointment(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.appointment();
        }

    }

    private static void printAppointmentAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
