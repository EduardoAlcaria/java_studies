package JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.tests;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class AssociationTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Sung");
        Team team = new Team("Monarch");

        player1.setTeam(team);
        player1.print();
    }

}

