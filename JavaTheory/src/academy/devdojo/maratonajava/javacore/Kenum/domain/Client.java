package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {

    public enum PaymentMethod{
        DEBIT,
        CREDIT
    }

    private final String name;
    private final TypeClient typeClient;
    private final PaymentMethod paymentMethod;

    public Client(String name, TypeClient typeClient, PaymentMethod paymentMethod) {
        this.name = name;
        this.typeClient = typeClient;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient+
                ", typeClientValue=" + typeClient.getIndex() +
                ", typeClientLOg=" + typeClient.getNameLog()+
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
