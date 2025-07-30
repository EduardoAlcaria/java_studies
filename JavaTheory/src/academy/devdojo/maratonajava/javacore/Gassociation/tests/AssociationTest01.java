package academy.devdojo.maratonajava.javacore.Gassociation.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;

public class AssociationTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Eduardo");
        Player player2 = new Player("Pele");
        Player player3 = new Player("Sung");

        Player[] players = new Player[]{player1, player2, player3};

        for (Player player : players) {
            player.print();
        }
    }
}

