package academy.devdojo.maratonajava.introduction;

public class Lesson07Conditionals02 {
    public static void main(String[] args) {
        int age = 12;
        String category;
        if (age < 15){
            category = "kids league";
        }else if (age >= 15 && age < 18) {
            category = "Juvenile league";
        }else {
            category = "Adults league";
        }
        System.out.println(category);
    }
}
