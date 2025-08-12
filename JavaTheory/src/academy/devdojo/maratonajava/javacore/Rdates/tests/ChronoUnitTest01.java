package JavaTheory.src.academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthDay = LocalDateTime.of(2006, Month.NOVEMBER, 25, 15, 0, 0);
        System.out.println(ChronoUnit.YEARS.between(birthDay, LocalDateTime.now()));

        LocalDate timeUntilBirthDay = LocalDate.of(LocalDate.now().getYear(), Month.NOVEMBER, 25);
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), timeUntilBirthDay));
    }
}
