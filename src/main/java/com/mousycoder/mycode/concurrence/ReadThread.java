package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-19 14:48
 */
public class ReadThread extends Thread {

    private static volatile int num = 0;
    private static volatile   boolean ready = false;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (ready) {
                System.out.println(num + num);
            }
            System.out.println("read thread....");
        }
    }

    public static class Writethread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over....");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadThread rt = new ReadThread();
        rt.start();


        Writethread wt = new Writethread();
        wt.start();

        Thread.sleep(1000);
        rt.interrupt();
        System.out.println("main exit");


    }


}
