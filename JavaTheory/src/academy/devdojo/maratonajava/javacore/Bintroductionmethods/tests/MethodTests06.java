package academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class MethodTests06 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] array = {1, 2, 3, 4, 5};
        calculator.arraySum(array);
        calculator.arrayVarArgs(1,2,3,4,5,6,7);
    }
}
