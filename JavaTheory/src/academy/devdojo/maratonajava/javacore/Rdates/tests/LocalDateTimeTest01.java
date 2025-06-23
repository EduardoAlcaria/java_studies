package academy.devdojo.maratonajava.javacore.Rdates.tests;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-10-06");
        LocalDate localDate = LocalDate.of(2025, Month.NOVEMBER, 25);
        LocalTime localTime = LocalTime.of(9, 45, 21);
        System.out.println(date);

        LocalDateTime ldt1 = localDate.atTime(localTime);
        LocalDateTime ldt2 = localTime.atDate(localDate);
        System.out.println(ldt1.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(ldt2.get(ChronoField.HOUR_OF_AMPM));

    }
}
