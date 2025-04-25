package academy.devdojo.maratonajava.javacore.Npolimorfizm.domain;

public class Tomato extends Product{

    public static final double TAX_PER_CENT = 0.06 ;

    public Tomato(String name, double price) {
        super(name, price);
    }


    @Override
    public double calculateTax() {
        return this.price * TAX_PER_CENT;
    }

    @Override
    public double priceAfterTax() {
        return this.price + this.price * calculateTax();
    }
}
