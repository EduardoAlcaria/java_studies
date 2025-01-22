package academy.devdojo.maratonajava.introduction;

public class Lesson8Repetitions {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("for");
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
        System.out.println("while");
        while(count < 10){
            System.out.println(++count);
        }
        count = 0;
        System.out.println("Do while");
        do {
            System.out.println(++count);
        }while (count < 10);
    }
}
