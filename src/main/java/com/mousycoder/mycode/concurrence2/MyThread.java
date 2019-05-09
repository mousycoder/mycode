package com.mousycoder.mycode.concurrence2;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-06 18:33
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("nice");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("good!");
        }
    }
}
