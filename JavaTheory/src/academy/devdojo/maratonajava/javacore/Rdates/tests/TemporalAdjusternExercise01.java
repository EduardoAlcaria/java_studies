package academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusternExercise01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2025, 7, 10);

        if (now.getDayOfWeek().getValue() < 4){
            System.out.println("today´s date " + now);
            System.out.println(now.plusDays(1).getDayOfWeek());
        }else{
            LocalDate nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            System.out.println("The day of the next monday will be " + nextMonday);
            System.out.println(nextMonday.getDayOfWeek());
        }
    }
}
