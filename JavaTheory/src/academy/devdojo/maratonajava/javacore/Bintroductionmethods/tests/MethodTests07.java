package academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class MethodTests07 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "gojo";
        employee.age = 35;
        employee.salary = new double[]{1200, 987.32, 2000};
        employee.printer();
    }
}
