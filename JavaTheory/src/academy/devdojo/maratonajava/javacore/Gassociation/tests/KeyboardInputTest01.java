package JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.tests;

import java.util.Scanner;

public class KeyboardInputTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();

        System.out.print("Type your age: ");
        int age = input.nextInt();

        System.out.print("Type M for male or F for female: ");
        char gen = input.next().charAt(0);

        System.out.print(name + " is " + age + " years old ");

        if ((gen == 'm') || (gen == 'M')){

            System.out.print("and he is a male");

        } else if ((gen == 'f') || (gen == 'F')) {

            System.out.print("and she is a female");

        }else{

            System.out.println("\nError: the program does not recognize this gender");
        }
    }
}
