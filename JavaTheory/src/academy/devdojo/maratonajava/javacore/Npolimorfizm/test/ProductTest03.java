package academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.services.CalculateTax;

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
