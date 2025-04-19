package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.PaymentMethod;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {

        Client client1 = new Client("Itadori", TypeClient.STUDENT, PaymentMethod.CREDIT);
        Client client2 = new Client("Gojo", TypeClient.TEACHER, PaymentMethod.DEBIT);


        System.out.println(client1);
        System.out.println(client2);
        System.out.println(PaymentMethod.DEBIT.calculateDiscount(100));
        System.out.println(PaymentMethod.CREDIT.calculateDiscount(100));

    }
}
