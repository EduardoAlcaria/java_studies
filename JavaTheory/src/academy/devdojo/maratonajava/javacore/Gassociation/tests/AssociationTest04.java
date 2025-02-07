package academy.devdojo.maratonajava.javacore.Gassociation.tests;

import academy.devdojo.maratonajava.javacore.Gassociation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociation.domain.Team;

public class AssociationTest04 {
    public static void main(String[] args) {
        Player player1 = new Player("Itadori");
        Player player2 = new Player("Megumi");
        Player player3 = new Player("Nobara");
        Player player4 = new Player("Satoru gojo");

        Player[] players = {player1, player2, player3, player4};

        Team team = new Team("jujutsu high");

        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);
        player4.setTeam(team);

        team.setPlayers(players);

        System.out.println("-----------  TEAM   -----------");

        team.print();

        System.out.println("----------- PLAYERS ------------");
        player1.print();
        player2.print();
        player3.print();
        player4.print();


    }

}
