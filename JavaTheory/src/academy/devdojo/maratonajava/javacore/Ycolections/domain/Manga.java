package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String title;
    private double price;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "id can not be null");
        Objects.requireNonNull(title, "title can not be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(price, manga.price) == 0 && Objects.equals(id, manga.id) && Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga o) {
        // negative if this < o
        // if this == o, return o
        // positive if this > o
//        if (this.id < o.getId()){
//            return -1;
//        }else if (this.getId().equals(o.getId())){
//            return 0;
//        }else{
//            return 1;
//        }

        //return Double.compare(this.price, o.getPrice());
        //return this.id.compareTo(o.getId());
        return this.title.compareTo(o.getTitle());

    }
}
