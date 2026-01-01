package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.service;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.domain.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Starting to deliver emails");
        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null){
                    continue;
                }

                System.out.println(Thread.currentThread().getName()+" Delivering email "+email);
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" Email Delivered "+email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName()+" Ending to deliver emails");
    }
}
