package academy.devdojo.maratonajava.javacore.Hinheritance.Domain;

public class Employee extends People{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void print() {
        super.print();
        System.out.println("Salary: " + this.salary + "$");
    }
}
