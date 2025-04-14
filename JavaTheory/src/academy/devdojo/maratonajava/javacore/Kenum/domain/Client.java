package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    public enum PaymentMethod{
        DEBIT, CREDIT
    }

    private TypeClient typeClient;
    private PaymentMethod paymentMethod;

    public Client(String name, TypeClient typeClient) {
        this.name = name;
        this.typeClient = typeClient;
    }

    public Client(String name, TypeClient typeClient, PaymentMethod paymentMethod){
        this(name, typeClient);
        this.name = name;
        this.typeClient = typeClient;
        this.paymentMethod = paymentMethod;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient.getNameLog() +
                ", typeClientValue=" + typeClient.getValue() +
                ", typePayment=" + paymentMethod +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}
