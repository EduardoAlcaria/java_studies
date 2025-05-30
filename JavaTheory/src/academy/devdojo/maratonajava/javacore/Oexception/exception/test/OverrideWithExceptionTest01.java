package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.People;

public class OverrideWithExceptionTest01 {
    public static void main(String[] args) {
        People people = new People();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }
}
