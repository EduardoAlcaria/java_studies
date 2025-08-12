package JavaTheory.src.academy.devdojo.maratonajava.javacore.Labstractclasses.tests;


import JavaTheory.src.academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Dev;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Dev dev = new Dev("Eduardo", 12000);
        Manager manager = new Manager("Lucas", 30000);

        dev.print();
        System.out.println(dev);

        manager.print();
        System.out.println(manager);

    }
}
