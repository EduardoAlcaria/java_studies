package academy.devdojo.maratonajava.javacore.Labstractclasses.tests;


import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Dev;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Dev dev = new Dev("Eduardo", 12000);
        Manager manager = new Manager("Lucas", 30000);

        System.out.println(dev);
        System.out.println(manager);
    }
}
