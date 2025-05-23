package academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.services.CalculateTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("GladOS", 1000);
        Tomato tomato = new Tomato("Italian", 10);
        Television television = new Television("Samsung Qled 50\"", 5000);
        CalculateTax.calculateTax(computer);

        System.out.println("-----------------");

        CalculateTax.calculateTax(tomato);

        System.out.println("-----------------");

        CalculateTax.calculateTax(television);
    }
}
