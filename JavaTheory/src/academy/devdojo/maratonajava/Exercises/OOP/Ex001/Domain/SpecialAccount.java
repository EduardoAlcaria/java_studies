package academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain;

public class SpecialAccount extends BankAccount{
    protected double limit = 30000;

    public SpecialAccount(String clientName, int numAccount, double balance) {
        super(clientName, numAccount, balance);
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= balance && balance - amount >= 0 && amount <= limit) {
            System.out.println("Your current balance is: " + balance + "RS");
            super.setBalance(getBalance() - amount);
            System.out.println("You've successfully withdraw: " + amount + "RS from your account");
            System.out.println("Your new balance is: " + getBalance() + "RS");
        }else if(amount > limit){
            System.out.println("This amount is greater than the limit");
        }else{
            System.out.println("This amount will make you your balance negative");
        }
    }

}
