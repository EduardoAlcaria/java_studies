package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Array index out of bounds");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }

        try {
            mightThrow();
        }catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void mightThrow() throws SQLException, FileNotFoundException{

    }
}
