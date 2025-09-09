package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.domain;

public class Account {
    private double balance = 50.0;

    public void withdrawl(double amount){
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return balance;
    }

}
