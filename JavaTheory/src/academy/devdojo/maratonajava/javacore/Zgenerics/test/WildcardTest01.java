package JavaTheory.src.academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void appointment();
}
class Dog extends Animal {

    @Override
    public void appointment() {
        System.out.println("the dog is at the clinic");
    }
}

class Cat extends Animal {

    @Override
    public void appointment() {
        System.out.println("the cat is at the clinic");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printAppointment(dogs);

        System.out.println("-------------------------");

        printAppointment(cats);
    }

    private static void printAppointment(Animal[] animals){
        for (Animal animal : animals) {
            animal.appointment();
        }
        animals[1] = new Cat();
    }
}
