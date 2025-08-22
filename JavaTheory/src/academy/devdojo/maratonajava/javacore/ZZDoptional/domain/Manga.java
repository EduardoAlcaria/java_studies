package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZDoptional.domain;

import java.util.Objects;

public class Manga {
    private Integer id;
    private String name;

    public Manga(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static int sortByName(Manga a1, Manga a2){
        return a1.getName().compareTo(a2.getName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
