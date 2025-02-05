package academy.devdojo.maratonajava.javacore.Gassociation.tests;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class AssociationTest02 {
    public static void main(String[] args) {

        Player player = new Player("Sung");
        Team team = new Team("Monarch");

        player.setTeam(team);
        player.print();
    }
}
