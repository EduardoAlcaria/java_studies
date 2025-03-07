package academy.devdojo.maratonajava.javacore.Hinheritance.Tests;

import academy.devdojo.maratonajava.javacore.Hinheritance.Domain.Address;
import academy.devdojo.maratonajava.javacore.Hinheritance.Domain.Employee;
import academy.devdojo.maratonajava.javacore.Hinheritance.Domain.People;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();

        address.setStreet("1st Street");
        address.setPostalCode("24125151");

        People people = new People("Itadorito");
        people.setCpf("1245125125125");
        people.setAddress(address);

        Employee employee = new Employee("Gojo Satoru");

        employee.setCpf("1245125125125");
        employee.setAddress(address);
        employee.setSalary(1000);

        people.print();
        System.out.println("--------------");
        employee.print();
        System.out.println("--------------");
        employee.report();

    }
}
