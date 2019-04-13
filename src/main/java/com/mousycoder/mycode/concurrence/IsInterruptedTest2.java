package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-11 17:45
 */
public class IsInterruptedTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
              while (!Thread.interrupted()){
              }
                System.out.println("threadOne isInterrupted: " + Thread.interrupted());
            }
        });

        threadOne.start();
        threadOne.interrupt();
        threadOne.join();
        System.out.println("main thread is over");


    }
}
