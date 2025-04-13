package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;

    private TypeClient typeClient;

    public Client(String name, TypeClient typeClient) {
        this.name = name;
        this.typeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
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
