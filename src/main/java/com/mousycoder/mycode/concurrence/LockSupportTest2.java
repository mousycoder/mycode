package com.mousycoder.mycode.concurrence;

import java.util.concurrent.locks.LockSupport;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-26 18:11
 */
public class LockSupportTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park!");
                LockSupport.park();
                System.out.println("child thread unpark!");
            }
        });

        thread.start();

        Thread.sleep(1000);
        System.out.println("main thread begin unpark!");
        LockSupport.unpark(thread);
    }
}
