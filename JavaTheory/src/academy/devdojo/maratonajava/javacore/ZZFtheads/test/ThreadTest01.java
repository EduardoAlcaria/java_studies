package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZFtheads.test;

class ThreadExemple extends Thread{
    private final char c;
    public ThreadExemple(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExempleRunnable implements Runnable{

    private final char c;

    public ThreadExempleRunnable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
        try {
            Thread.sleep(2000);

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        ThreadExemple t1 = new ThreadExemple('A');D
//        ThreadExemple t2 = new ThreadExemple('B');D
//        ThreadExemple t3 = new ThreadExemple('C');D
//        ThreadExemple t4 = new ThreadExemple('D');D

        Thread t1 = new Thread(new ThreadExemple('A'), "T1A");
        Thread t2 = new Thread(new ThreadExemple('B'), "T2B");
        Thread t3 = new Thread(new ThreadExemple('C'), "T3C");
        Thread t4 = new Thread(new ThreadExemple('D'), "T4D");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
