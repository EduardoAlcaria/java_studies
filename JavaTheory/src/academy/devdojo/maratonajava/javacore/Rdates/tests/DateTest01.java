package academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); // 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}