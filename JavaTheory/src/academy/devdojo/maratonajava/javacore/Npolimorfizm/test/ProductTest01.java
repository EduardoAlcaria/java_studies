package academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.services.CalculateTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("GladOS", 1000);
        Tomato tomato = new Tomato("Italian", 10);

        CalculateTax.calculateTaxComputer(computer);

        System.out.println("-----------------");

        CalculateTax.calculateTaxTomato(tomato);
    }
}
