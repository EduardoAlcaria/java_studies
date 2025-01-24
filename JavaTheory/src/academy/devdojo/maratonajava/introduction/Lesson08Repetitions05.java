package academy.devdojo.maratonajava.introduction;

public class Lesson08Repetitions05 {
    public static void main(String[] args) {
         double carPrice = 30000;
        for (int i = (int) carPrice; i >= 1; i--) {
            double timesValue = carPrice/i;
            if (timesValue < 1000){
                continue;
            }
            System.out.println(" times "+i+" times value "+timesValue);
        }
    }
}
