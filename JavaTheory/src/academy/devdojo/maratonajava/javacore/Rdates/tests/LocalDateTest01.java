package academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        LocalDate date1 = LocalDate.of(2025, 11, 25);
        LocalDate now = LocalDate.now();
        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.lengthOfMonth());
        System.out.println(date1.isLeapYear());
        System.out.println(date1.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date1);
        System.out.println(now);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);

    }
}
