package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void addTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(18 - 10);
    }

    public void times(int a, int b) {
        System.out.println(a * b);
    }

    public double split(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double split2(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

    public void printSplit2(double a, double b) {
        if (b != 0) {
            System.out.println(a / b);
            return;
        }
        System.out.println("splitting a number by 0 is not possible");
    }
}
