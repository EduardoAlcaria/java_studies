package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class People {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving People");
    }
}
