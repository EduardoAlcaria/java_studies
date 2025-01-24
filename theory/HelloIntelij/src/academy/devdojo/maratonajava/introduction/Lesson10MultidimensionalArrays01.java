package academy.devdojo.maratonajava.introduction;

public class Lesson10MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        int counter = 1;
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                days[i][j] += counter;
                counter++;
            }
        }
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
    }
}

