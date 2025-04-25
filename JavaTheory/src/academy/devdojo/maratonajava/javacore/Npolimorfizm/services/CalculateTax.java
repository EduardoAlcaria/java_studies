package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;

public class CalculateTax {
    public static void calculateTax(Product product){
        double tax =  product.calculateTax();
        System.out.println("taxes report");
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("taxes: " + tax);
        System.out.println("Price after taxes: " + product.priceAfterTax());
        if (product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            System.out.println(((Tomato) product).getValidUntil());
        }
    }

}
