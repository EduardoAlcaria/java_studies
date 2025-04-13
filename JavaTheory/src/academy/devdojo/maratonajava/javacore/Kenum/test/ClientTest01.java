package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("itadori", TypeClient.STUDENT);
        Client client2 = new Client("gojo", TypeClient.PROFESSOR);
        Client client3 = new Client("gojoA", TypeClient.PROFESSOR);
        Client client4 = new Client("gojoB", TypeClient.PROFESSOR);
        Client client5 = new Client("gojoC", TypeClient.PROFESSOR);


        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
        System.out.println(client5);
    }
}
