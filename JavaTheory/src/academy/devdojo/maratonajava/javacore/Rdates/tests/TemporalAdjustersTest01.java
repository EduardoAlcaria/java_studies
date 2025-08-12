package JavaTheory.src.academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.withDayOfMonth(8);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withMonth(11).withDayOfMonth(25);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
