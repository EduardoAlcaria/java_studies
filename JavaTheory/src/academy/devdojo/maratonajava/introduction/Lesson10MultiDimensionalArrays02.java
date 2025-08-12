package JavaTheory.src.academy.devdojo.maratonajava.introduction;

public class Lesson10MultiDimensionalArrays02 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        int count = 1;
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                days[i][j] += count;
                count++;
            }
        }
        for (int[] arr: days){
            for(int num: arr){
                System.out.println(num);
            }
        }
    }


}
