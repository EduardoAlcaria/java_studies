package JavaTheory.src.academy.devdojo.maratonajava.javacore.Qstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Eduardo";
        name.concat(" Alcaria");
        System.out.println(name);
        name.substring(0, 3);
        StringBuilder sb = new StringBuilder("Eduardo");
        sb.append(" Alcaria");
        sb.delete(0, 3);
        String ret = sb.substring(0, 2);
        System.out.println(ret);
        System.out.println(sb);
    }
}
