package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public final static double SPEED_LIMIT;
    private final Buyer BUYER = new Buyer();

    static {
        SPEED_LIMIT = 250;
    }

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

