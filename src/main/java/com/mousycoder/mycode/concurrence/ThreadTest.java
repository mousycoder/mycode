package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-09 17:03
 */
public class ThreadTest {

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("I am a child thread ");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
