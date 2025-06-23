package academy.devdojo.maratonajava.javacore.Sformatation.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isosCountries =  Locale.getISOCountries();
        String[] isosLangs =  Locale.getISOLanguages();

        for (String isosCountry : isosCountries) {
            System.out.print(isosCountry + " ");
        }

        for (String isosLang : isosLangs) {
            System.out.print(isosLang + " ");
        }


    }
}
