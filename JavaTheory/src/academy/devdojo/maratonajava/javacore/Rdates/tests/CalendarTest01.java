package JavaTheory.src.academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("sunday is the first day of the week");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.DAY_OF_MONTH, 12);
        c.roll(Calendar.HOUR_OF_DAY, 12);
        Date date = c.getTime();
        System.out.println(date);
    }
}
