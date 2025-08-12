package JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain;

public abstract class BankAccount {
    protected String clientName;
    protected int numAccount;
    protected double balance;

    public BankAccount(String clientName, int numAccount, double balance) {
        this.clientName = clientName;
        this.numAccount = numAccount;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance && balance - amount >= 0) {
            double newBalance = balance - amount;
            System.out.println("Your current balance is: " + balance + "RS");
            System.out.println("You've successfully withdraw: " + amount + "RS from your account");
            System.out.println("Your new balance is: " + newBalance + "RS");
        }else{
            System.out.println("This amount will make your balance negative");
        }
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public double getBalance() {
        return balance;
    }
}