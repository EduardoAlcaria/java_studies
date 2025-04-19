package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class Dev extends Employee {
    public Dev(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
