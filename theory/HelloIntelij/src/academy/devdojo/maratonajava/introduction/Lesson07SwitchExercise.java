package academy.devdojo.maratonajava.introduction;

public class Lesson07SwitchExercise {
    public static void main(String[] args) {
        byte day = 7;
        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
