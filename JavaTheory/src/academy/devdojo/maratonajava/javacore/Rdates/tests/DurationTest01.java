package academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime nowTimeMinusSevenHours = LocalTime.now().minusHours(7);
        Duration between = Duration.between(now, nowAfterTwoYears);
        Duration between2 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration between3 = Duration.ofDays(20);
        Duration between4 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(between);
        System.out.println(between2);
        System.out.println(between3);
        System.out.println(between4);
    }
}
