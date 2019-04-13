package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-11 17:45
 */
public class IsInterruptedTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {

                }
            }
        });

        threadOne.start();
        threadOne.interrupt();

        System.out.println("isInterrupted:" + threadOne.isInterrupted());

        System.out.println("isInterrupted:" + Thread.interrupted());

        System.out.println("isInterrupted:" + threadOne.isInterrupted());

        threadOne.join();

        System.out.println("main thread is over");


    }
}
