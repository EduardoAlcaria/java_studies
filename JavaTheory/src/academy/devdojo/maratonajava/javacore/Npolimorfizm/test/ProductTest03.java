package JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Product;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.services.CalculateTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("GladOS", 1000);

        Tomato tomato = new Tomato("italian", 10);

        tomato.setValidUntil("25/12/2025");

        CalculateTax.calculateTax(product);

        System.out.println("---------------------------");



        CalculateTax.calculateTax(tomato);

    }
}
