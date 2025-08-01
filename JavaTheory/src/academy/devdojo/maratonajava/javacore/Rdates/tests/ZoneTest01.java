package academy.devdojo.maratonajava.javacore.Rdates.tests;


import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyo= ZoneId.of("Asia/Tokyo");
        System.out.println(tokyo);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyo);
        System.out.println(zonedDateTime);


        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);


        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyo);
        System.out.println(zonedDateTime1);


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEra = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate1 = JapaneseDate.from(meijiEra);
        System.out.println(japaneseDate1);


    }
}
