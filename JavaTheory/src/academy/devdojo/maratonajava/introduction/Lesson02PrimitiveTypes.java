package academy.devdojo.maratonajava.introduction;

public class Lesson02PrimitiveTypes {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        long hugeNumber = 1000000;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean isTrue = true;
        boolean isFalse = false;
        String name = "Eduardo Alcaria Lopes";
        char letter = 'A'; //can be used with Unicode or even the ascii table
        System.out.println("the variable age is "+age+" years old");
        System.out.println(isTrue);
        System.out.println("Char "+letter);
        System.out.println("name "+name);
    }
}