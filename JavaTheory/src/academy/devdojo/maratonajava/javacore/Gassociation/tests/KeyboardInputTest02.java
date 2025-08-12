package JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.tests;

import java.util.Scanner;

public class KeyboardInputTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your question and i will answer with yes or no ");
        System.out.print("Type your question: ");

        String question = input.nextLine();


        if ((question.charAt(0)) == 'a' || (question.charAt(0) == 'A')){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

