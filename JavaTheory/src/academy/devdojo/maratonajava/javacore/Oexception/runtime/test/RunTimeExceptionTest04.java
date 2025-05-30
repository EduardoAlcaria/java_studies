package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }

        try {
            mightThrow();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void mightThrow() throws SQLException, FileNotFoundException {

    }
}
