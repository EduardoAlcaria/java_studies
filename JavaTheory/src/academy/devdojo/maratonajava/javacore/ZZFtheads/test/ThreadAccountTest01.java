package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.test;

import JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Zaraki");
        Thread t2 = new Thread(threadAccountTest01, "Gojo Satoru");
        t1.start();
        t2.start();


    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10.0);
            if (account.getBalance() < 0){
                System.out.println("WE ARE NOW POOR");
            }
        }
    }

    private void withdrawal(double amount){
        if (account.getBalance() >= amount){
            System.out.println(getName() + " is going to withdrawal " + amount + "$");
            account.withdrawl(amount);
            System.out.println(getName() + " account balance is now " + account.getBalance() + "$");
        }else{
            System.out.println("there is no money to withdrawal for " + getName() + " account");
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}


