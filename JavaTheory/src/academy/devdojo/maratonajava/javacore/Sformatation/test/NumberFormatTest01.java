package academy.devdojo.maratonajava.javacore.Sformatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;


        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(localeJP);
        numberFormat[2] = NumberFormat.getInstance(localeBR);
        numberFormat[3] = NumberFormat.getInstance(localeIT);

        double value = 10_000.1231;

        for (NumberFormat format : numberFormat) {
            System.out.println(format.format(value));
        }

        String valueString = "1000.2130";
        try {
            System.out.println(numberFormat[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
