package academy.devdojo.maratonajava.introduction;

public class Lesson8BreakingRepetitions {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
