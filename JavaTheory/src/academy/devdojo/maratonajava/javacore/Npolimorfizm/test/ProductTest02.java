package academy.devdojo.maratonajava.javacore.Npolimorfizm.test;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("GladOS", 1000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTax());

        System.out.println("---------------------------");

        Product product2 = new Tomato("italian", 10);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());
    }
}
