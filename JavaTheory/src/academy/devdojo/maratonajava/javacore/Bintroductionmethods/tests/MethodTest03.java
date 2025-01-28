package academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class MethodTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double r = calculator.split(20, 2);
        double r1 = calculator.split2(20, 2);
        calculator.printSplit2(20,0);
        System.out.println(r);
        System.out.println(r1);
    }
}
