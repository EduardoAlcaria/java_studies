package academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringsTest01 {
    public static void main(String[] args) {
        String name = "Eduardo";
        String name2 = "Eduardo";
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        name.concat(" Alcaria");
        System.out.println(name);
        String name3 = new String("Eduardo");
        System.out.println(name2 == name3);

    }
}
