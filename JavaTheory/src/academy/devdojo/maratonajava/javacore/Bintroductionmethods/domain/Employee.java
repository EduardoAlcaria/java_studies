package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;


public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void averageSalary() {
        if (salary == null) {
            return;
        }

        double average = 0;

        for (double s : salary) {
            average += s;
        }

        average /= salary.length;

        System.out.print("\naverage salary: ");
        System.out.println(average);
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
}
