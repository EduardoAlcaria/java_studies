package JavaTheory.src.academy.devdojo.maratonajava.javacore.Npolimorfizm.domain;

public class Tomato extends Product{

    public static final double TAX_PER_CENT = 0.06 ;
    private String validUntil;

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

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
