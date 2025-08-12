package JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain;

public class SavingsAccount extends BankAccount{

    protected double dayInterestRate = 0.1;

    public SavingsAccount(String clientName, int numAccount, double balance) {
        super(clientName, numAccount, balance);
    }


    public void calcNewBalance(){
        balance += balance * dayInterestRate;
    }



}
