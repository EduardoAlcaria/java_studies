package JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.domain;

public class Television extends Product{

    public static final double TAX_PER_CENT = 0.21 ;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PER_CENT;
    }

    @Override
    public double priceAfterTax() {
        return this.price + calculateTax();
    }
}
