package academy.devdojo.maratonajava.javacore.Ioverride.domian;

public class Anime {
    private String animeName;

    public Anime(String name) {
        this.animeName = name;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "animeName='" + animeName + '\'' +
                '}';
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }
}
