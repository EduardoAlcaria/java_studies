package JavaTheory.src.academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;


public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average = 0;
    private void averageSalary() {
        if (salary == null) {
            return;
        }

        for (double s : salary) {
            this.average += s;
        }

        this.average /= salary.length;

        System.out.print("\naverage salary: ");
        System.out.print(average);
    }
    public void printer(){
        System.out.println(this.name);
        System.out.println(this.age);

        if (salary == null){
            return;
        }

        System.out.print("Salary's: ");

        for (double s : this.salary){
            System.out.print(s + " ");
        }

        averageSalary();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double... salary){
        this.salary = salary;
    }
}
