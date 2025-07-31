package JavaTheory.src.academy.devdojo.maratonajava.javacore.Ycolections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

   @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
