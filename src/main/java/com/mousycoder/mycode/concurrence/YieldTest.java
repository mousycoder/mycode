package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-11 17:16
 */
public class YieldTest implements Runnable {

    YieldTest(){
        Thread t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        for (int i = 0 ; i < 5; i ++ ){
            if ( (i % 5) == 0 ){
                System.out.println(Thread.currentThread() + "yield cpu...");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread() + " is over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
