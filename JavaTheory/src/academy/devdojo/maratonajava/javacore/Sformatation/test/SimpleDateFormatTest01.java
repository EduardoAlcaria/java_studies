package JavaTheory.src.academy.devdojo.maratonajava.javacore.Sformatation.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brazil' dd MMMM 'of' yyyy HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
