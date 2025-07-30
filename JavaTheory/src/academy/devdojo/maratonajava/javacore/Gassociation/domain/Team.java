package JavaTheory.src.academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println("Team: " + this.name);

        if (players == null){
            return;
        }

        for (Player player : players){
            System.out.println("Player: " + player.getName());
        }
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}