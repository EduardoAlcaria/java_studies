package academy.devdojo.maratonajava.javacore.Sformatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;


        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1000.2130;

        for (NumberFormat format : numberFormat) {
            format.setMaximumFractionDigits(2);
            System.out.println(format.format(value));
        }

        String valueString = "￥1,000";

        try {
            System.out.println(numberFormat[1].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
