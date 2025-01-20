package academy.devdojo.maratonajava.introduction;

public class Lesson06LogicOperators {
    public static void main (String[] args) {
        boolean isTenHigherThen20 = 10 > 20;
        boolean isTenLowerThen20 = 10 < 20;
        boolean isTenIgual20 = 10 == 20;
        boolean isTenDifferent20 = 10 != 20;
        System.out.println("isTenHigherThen20 "+isTenHigherThen20);
        System.out.println("isTenLowerThen20 "+isTenLowerThen20);
        System.out.println("isTenIgual20 "+isTenIgual20);
        System.out.println("isTenDifferent20 "+isTenDifferent20);

        int age = 17;
        float salary = 3500;
        boolean isTrue = age >= 18 && salary >= 3000;
        System.out.println("isTrue "+isTrue);
    }
}
