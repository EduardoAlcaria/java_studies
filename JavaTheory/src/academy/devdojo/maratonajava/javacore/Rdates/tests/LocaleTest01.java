package academy.devdojo.maratonajava.javacore.Rdates.tests;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        System.out.println(df.format(calendar.getTime()));
        System.out.println(localeBrazil.getDisplayCountry());
    }
}
