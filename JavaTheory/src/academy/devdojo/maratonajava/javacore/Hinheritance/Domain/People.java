package JavaTheory.src.academy.devdojo.maratonajava.javacore.Hinheritance.Domain;

public class People {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("inside the init static block people");
    }

    {
        System.out.println("inside the init block people 1");
    }
    {
        System.out.println("inside the init block people 2");
    }

    public People(String name) {
        this.name = name;
        System.out.println("Inside Peoples constructor");
    }

    public People(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Street: " + this.address.getStreet());
        System.out.println("Postal code: " + this.address.getPostalCode());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
