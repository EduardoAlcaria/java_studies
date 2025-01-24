package academy.devdojo.maratonajava.introduction;

public class Lesson07Conditionals01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isCanBuyBeer = age >= 18;
        if (isCanBuyBeer) {
            System.out.println("you can buy beer");
        }else{
            System.out.println("You cant buy beer");
        }
    }
}
