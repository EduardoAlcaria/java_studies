package JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Test;

import JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain.Actions;
import JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain.BankAccount;
import JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain.SavingsAccount;
import JavaTheory.src.academy.devdojo.maratonajava.Exercises.OOP.Ex001.Domain.SpecialAccount;

public class Test {
    public static void main(String[] args) {

        BankAccount bankAccountSpecial = new SpecialAccount("Satoru Gojo", 12345, 30000);
        BankAccount bankAccountSavings  = new SavingsAccount("Itadori", 24151, 1000);




        Actions.showInfo(bankAccountSavings);

        System.out.println("----------------------------------------");

        Actions.showInfo(bankAccountSpecial);

        System.out.println("----------------------------------------");

        Actions.withdraw(bankAccountSavings, 100);

        System.out.println("----------------------------------------");

        Actions.withdraw(bankAccountSpecial, 30001);

        System.out.println("----------------------------------------");

        Actions.showNewBalanceAfterInterest(bankAccountSavings, 10);

        System.out.println("----------------------------------------");

        Actions.showNewBalanceAfterInterest(bankAccountSpecial, 10);

        System.out.println("----------------------------------------");

        Actions.deposit(bankAccountSpecial, 1000);

        System.out.println("----------------------------------------");

        Actions.deposit(bankAccountSavings, 1000);

        System.out.println("----------------------------------------");



    }
}
