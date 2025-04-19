package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {

        Client client1 = new Client("Itadori", TypeClient.STUDENT, Client.PaymentMethod.CREDIT);
        Client client2 = new Client("Gojo", TypeClient.TEACHER, Client.PaymentMethod.DEBIT);
        Client client3 = new Client("Sukuna", TypeClient.TEACHER, Client.PaymentMethod.DEBIT);


        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

    }
}
