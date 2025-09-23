package JavaTheory.src.academy.devdojo.maratonajava.javacore.ZZGConcurrency.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.tryLock(2, TimeUnit.SECONDS);
            System.out.printf("There are %d Threads waiting on the queue %n", lock.getQueueLength());
            System.out.printf("Thread %s will wait for 2 segs %n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s is now free%n",name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }


}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();



    }
}
