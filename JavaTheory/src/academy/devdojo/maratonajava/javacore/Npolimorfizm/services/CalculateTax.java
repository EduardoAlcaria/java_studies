package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Product;

public class CalculateTax {
    public static void calculateTax(Product product){
        System.out.println("taxes report");
        double tax =  product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("taxes: " + tax);
        System.out.println("Price after taxes: " + product.priceAfterTax());

    }

}
