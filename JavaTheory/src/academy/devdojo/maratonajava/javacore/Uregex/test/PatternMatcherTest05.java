package JavaTheory.src.academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z0-9])+)+";
        String text = "eduardoalcarialopes@gmail.com, 123satorugojo@outlook.com.br, #@!itadori@mail.br";
        System.out.println("#@!itadori@mail.br".matches(regex));
        System.out.println("itadori@mail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());

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
