package academy.devdojo.maratonajava.introduction;

public class Lesson07ConditionalsExercise {
    public static void main(String[] args) {
        double salary = 70000;
        double salaryAfterTax;
        if (salary <= 34712){
            salaryAfterTax = salary * 9.70/100;
        } else if (salary > 34712 && salary <= 68507) {
            salaryAfterTax = salary * 37.35/100;
        }else{
            salaryAfterTax = salary * 49.50/100;
        }
        System.out.println(salaryAfterTax);
    }
}
