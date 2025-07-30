package JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.domain;

import java.io.Serializable;
import java.util.List;

public class PlayerData implements Serializable {
    private String name;
    private int xp;
    private transient List<String> achievements;

    public PlayerData(String name, int xp, List<String> achievements) {
        this.name = name;
        this.xp = xp;
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", xp=" + xp +
                ", achievements=" + achievements +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }
}
