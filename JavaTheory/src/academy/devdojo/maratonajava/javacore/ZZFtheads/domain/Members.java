package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public void close(){
        open = false;
    }

    public int pendingEmails(){
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public void addMember(String email){
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName()+" is adding the email");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +" checking if there are any email");
        synchronized (this.emails) {
            while(this.emails.isEmpty()){
                if (!open){
                    return null;
                }
                System.out.println(Thread.currentThread().getName()+" there are no email in the list, entering waiting mode");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }




}
