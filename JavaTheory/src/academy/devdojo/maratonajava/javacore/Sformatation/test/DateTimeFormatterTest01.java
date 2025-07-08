package academy.devdojo.maratonajava.javacore.Sformatation.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String format1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = now.format(DateTimeFormatter.ISO_DATE);
        String format3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);

        LocalDate parse1 = LocalDate.parse("20250709", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-07-08+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-07-08", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
    }
}
