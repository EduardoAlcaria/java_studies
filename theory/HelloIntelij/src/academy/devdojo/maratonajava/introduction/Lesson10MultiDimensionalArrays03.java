package academy.devdojo.maratonajava.introduction;

public class Lesson10MultiDimensionalArrays03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {4 ,5 ,6 };
        arrayInt[0] = new int[]{1 ,2 ,3 };
        arrayInt[1] = array;
        arrayInt[2] = new int[]{7 ,8 ,9 };

        int[][] arrayInt2 = {{1,2,3}, {4,5,6} ,{7,8,9}};

        for (int[] arrayBase : arrayInt){
            System.out.println("\n-----");
            for (int num : arrayBase){
                System.out.print(num);
            }
        }
    }
}
