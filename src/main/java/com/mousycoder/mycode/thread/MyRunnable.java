package com.mousycoder.mycode.thread;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-03-12 10:08
 */
public class MyRunnable implements Runnable {

    long num;


    MyRunnable(long num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " beging");
        System.out.println(num);
        System.out.println(Thread.currentThread().getName() + " end");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " begin");
        MyRunnable myRunnable = new MyRunnable(100L);
        new Thread(myRunnable).start();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
