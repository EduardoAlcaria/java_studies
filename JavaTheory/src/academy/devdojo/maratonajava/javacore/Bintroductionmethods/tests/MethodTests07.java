package JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class MethodTests07 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Itadori");
        employee.setAge(35);
        employee.setSalary(1200, 987.32, 2000);
        employee.printer();
    }
}
