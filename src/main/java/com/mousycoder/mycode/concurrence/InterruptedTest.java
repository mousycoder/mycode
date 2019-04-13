package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-11 17:31
 */
public class InterruptedTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread() + " hello");
                }
            }
        });


        thread.start();
        Thread.sleep(100);
        System.out.println("main thread interrupt thread");
        thread.interrupt();
        thread.join();
        System.out.println("main is over");
    }
}
