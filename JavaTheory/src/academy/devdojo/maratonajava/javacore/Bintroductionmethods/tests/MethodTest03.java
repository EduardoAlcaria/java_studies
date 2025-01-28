package academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class MethodTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double r = calculator.slit(20, 2);
        System.out.println(r);
    }
}
