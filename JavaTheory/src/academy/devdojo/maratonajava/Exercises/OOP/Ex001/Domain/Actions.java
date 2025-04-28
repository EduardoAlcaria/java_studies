package academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain;

public class Actions{
    public static void showInfo(BankAccount bankAccount){
        System.out.println("Client Name: " + bankAccount.getClientName());
        System.out.println("Account balance: " + bankAccount.getBalance() + "RS");
        System.out.println("Account number: " + bankAccount.getNumAccount());
    }

    public static void withdraw(BankAccount bankAccount, double amount){
        if (bankAccount instanceof SpecialAccount specialAccount){
            specialAccount.withdraw(amount);
        }else if(bankAccount instanceof SavingsAccount savingsAccount){
            savingsAccount.withdraw(amount);
        }else{
            bankAccount.withdraw(amount);
        }

    }
    public static void deposit(BankAccount bankAccount, double amount){
        if (bankAccount instanceof SavingsAccount savingsAccount){
            savingsAccount.calcNewBalance();
            System.out.println("you new balance after interesting rates is: " + savingsAccount.getBalance() + "RS" );
        }else if(bankAccount instanceof SpecialAccount){
            bankAccount.deposit(amount);
            System.out.println("You've successfully deposited: " + amount + "RS to your account");
            System.out.println("Your new balance is: " + bankAccount.getBalance() + "RS");
        }

    }

    public static void showNewBalanceAfterInterest(BankAccount bankAccount, int interestRate){

        double balanceAfterInterest = bankAccount.getBalance() + bankAccount.getBalance() * interestRate/100;

        System.out.println("your balance would be: " + balanceAfterInterest + "RS after interest of " +
                interestRate + "%");
    }


}
