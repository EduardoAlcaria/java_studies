package JavaTheory.src.academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Satoru Gojo";
        String passwordDB = "purple";
        System.out.println("user: ");
        String usernameLocal = scanner.nextLine();
        System.out.println("password: ");
        String passwordLocal = scanner.nextLine();
        if(!usernameLocal.equals(usernameDB) || !passwordLocal.equals(passwordDB)){
            throw new InvalidLoginException("Invalid username or password");
        }

        System.out.println("Login successful");
    }
}
