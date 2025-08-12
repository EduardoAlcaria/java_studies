package JavaTheory.src.academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calcBonus() {
        this.salary = this.salary + this.salary * 0.2;
    }

}
