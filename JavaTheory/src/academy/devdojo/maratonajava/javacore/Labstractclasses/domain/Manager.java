package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
