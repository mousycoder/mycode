package com.mousycoder.mycode.thread;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-03-12 10:21
 */
public class ThreadState3 implements Runnable {

    final Object lock = new Object();

    public ThreadState3() {
    }

    public static void main(String[] args) {
        ThreadState3 threadState1 = new ThreadState3();
        Thread thread1 = new Thread(threadState1);
        Thread thread2 = new Thread(threadState1);


        System.out.println(thread1.getName() + " 构造函数后线程的状态:" + thread1.getState());
        thread1.start();
        try {
            Thread.sleep(1000);
            thread2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getName() + " 线程刚开始线程的状态: " + thread1.getState());
        System.out.println(thread2.getName() + " 线程刚开始线程的状态: " + thread1.getState());

    }

    @Override
    public void run() {

        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {

            }
        }

        System.out.println("sleep start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep end");
    }
}
