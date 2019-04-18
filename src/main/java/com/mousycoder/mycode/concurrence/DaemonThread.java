package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-13 18:46
 */
public class DaemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){

                }
            }
        });

        thread.setDaemon(true);
        thread.start();
        System.out.println("main thread is over");
    }
}
