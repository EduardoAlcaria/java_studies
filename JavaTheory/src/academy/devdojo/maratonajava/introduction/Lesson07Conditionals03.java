package academy.devdojo.maratonajava.introduction;

public class Lesson07Conditionals03 {
    public static void main(String[] args) {
        double salary = 5000;
        String donate = "Im going to donate";
        String dontDonate = "im not going to donate, i dont have money yet";
        String result = salary >= 5000 ? donate : dontDonate;
        System.out.println(result);
    }
}
