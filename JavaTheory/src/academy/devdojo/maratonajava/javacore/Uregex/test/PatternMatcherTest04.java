package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Every Digit
        // \D = Every not Digit
        // \s = Every blank space like \t \n \f \t
        // \S = every char that is not a blank space
        // \w = a-zA-Z, digits, _
        // \W = everything that is not included on \w
        // [] range
        // ? zero or one occurrences
        // * zero or more occurrences
        // + one or more
        // {n, m} from n to m
        // ()
        // | o(v|c)o ovo | oco
        // $ end of the line
        String regex = "0[xX]([\\d-a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("found pos");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numHex = 0x14B13FF;
        System.out.println(numHex);
    }
}
