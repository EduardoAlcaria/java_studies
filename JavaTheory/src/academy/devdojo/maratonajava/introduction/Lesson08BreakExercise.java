package JavaTheory.src.academy.devdojo.maratonajava.introduction;

public class Lesson08BreakExercise {
    public static void main(String[] args) {
        double carPrice = 50000;
        for (int i = 1; i <= carPrice; i++) {
            double timesValue = carPrice/i;
            if (timesValue >= 1000) {
                System.out.println("times " + i + ": value $" + timesValue);
            }else{
                break;
            }
        }
    }
}
