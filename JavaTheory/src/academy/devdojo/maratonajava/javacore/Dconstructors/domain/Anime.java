package academy.devdojo.maratonajava.javacore.Dconstructors.domain;

public class Anime {

    private String name;
    private String type;
    private String gen;
    private String studio;
    private int episodes;

    public Anime(String name, String type, String gen, int episodes){
        this();
        this.name = name;
        this.type = type;
        this.gen = gen;
        this.episodes = episodes;
    }
    public Anime(String name, String type, String gen, String studio, int episodes){
        this(name, type, gen, episodes);
        this.name = name;
        this.type = type;
        this.gen = gen;
        this.episodes = episodes;
        this.studio = studio;
    }
    public Anime(){

    }

    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String gen){
        init(name, type, episodes);
        this.gen = gen;
    }

    public void printer(){
        System.out.println(this.name);
        System.out.println(this.gen);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.studio);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }
    public void setGen(String gen){
        this.gen = gen;
    }
    public String getGen(){
        return gen;
    }
}