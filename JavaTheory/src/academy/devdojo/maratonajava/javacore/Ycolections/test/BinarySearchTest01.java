package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(0);
        num.add(4);
        num.add(3);
        // (-(insert point) - 1)

        Collections.sort(num);
        System.out.println("index " + Collections.binarySearch(num,1));
    }
}
