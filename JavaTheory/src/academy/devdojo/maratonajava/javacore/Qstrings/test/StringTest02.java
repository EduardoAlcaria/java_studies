package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "                    Satoru Gojo";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("o", "*"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0, 8));
        System.out.println(name.substring(0, name.length()));
        System.out.println(name.trim());
    }
}
