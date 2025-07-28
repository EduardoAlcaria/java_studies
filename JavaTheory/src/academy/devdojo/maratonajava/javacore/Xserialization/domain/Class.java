package JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.domain;



public class Class {
    private String name;

    public Class(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
