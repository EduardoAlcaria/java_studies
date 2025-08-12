package JavaTheory.src.academy.devdojo.maratonajava.javacore.Hinheritance.Domain;

public class Employee extends People{
    private double salary;
    static {
        System.out.println("inside the init static block Employee");
    }

    {
        System.out.println("inside the init block Employee 1");
    }
    {
        System.out.println("inside the init block Employee 2");
    }
    public Employee(String name){
        super(name);
        System.out.println("Inside the Employee constructor");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void report(){
        System.out.println("I " + this.name + " got " + this.salary + " worth of salary ");
    }

    public void print() {
        super.print();
        System.out.println("Salary: " + this.salary + "$");
    }
}
