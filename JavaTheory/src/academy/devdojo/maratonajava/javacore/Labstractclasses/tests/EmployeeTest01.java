package academy.devdojo.maratonajava.javacore.Labstractclasses.tests;

import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Dev;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Manager manager = new Manager("Gojo", 5000);
        System.out.println(manager);

        Dev dev = new Dev("Itadori", 10000);
        System.out.println(dev);




    }
}
