package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.domain.Members;
import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread satoruGojo = new Thread(new EmailDeliveryService(members), "Satoru Gojo");
        Thread aizen = new Thread(new EmailDeliveryService(members), "Aizen");

        satoruGojo.start();
        aizen.start();

        while(true){
            String email = JOptionPane.showInputDialog("Enter your email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMember(email);
        }

    }
}
