package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String name;
    private int episodes;

    public Anime(String name, int quantity) {
        this.name = name;
        this.episodes = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
