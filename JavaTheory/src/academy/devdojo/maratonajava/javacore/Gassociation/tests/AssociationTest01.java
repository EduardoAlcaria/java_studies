package academy.devdojo.maratonajava.javacore.Gassociation.tests;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;

public class AssociationTest01 {
    public static void main(String[] args) {

        Player player1 = new Player("Sung");
        Player player2 = new Player("Pele");
        Player player3 = new Player("Ronaldinho");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }
    }
}
