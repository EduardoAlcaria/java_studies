package academy.devdojo.maratonajava.javacore.Npolimorfizm.services;

import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfizm.domain.Tomato;

public class CalculateTax {

    public static void calculateTaxComputer(Computer computer){
        System.out.println("Computer taxes log");
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Computer tax: " + computer.calculateTax());
        System.out.println("Computer price after taxes: " + computer.calculateTax());
    }

    public static void calculateTaxTomato(Tomato tomato){
        System.out.println("Tomato taxes log");
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getPrice());
        System.out.println("Tomato tax: " + tomato.calculateTax());
        System.out.println("Tomato price after taxes: " + tomato.priceAfterTax());
    }

}
