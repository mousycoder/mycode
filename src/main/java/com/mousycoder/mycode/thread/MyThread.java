package com.mousycoder.mycode.thread;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-03-12 10:04
 */
public class MyThread extends Thread{

    long num = 0;

    MyThread(long num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin");
        System.out.println(num);
        System.out.println(Thread.currentThread().getName() + " end");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " begin ");
        MyThread myThread = new MyThread(100L);
        myThread.start();
        System.out.println(Thread.currentThread().getName() + " end");
    }

}
