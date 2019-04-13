package com.mousycoder.mycode.thread;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-03-12 10:21
 */
public class ThreadState1 implements Runnable{

    public ThreadState1(){
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " run方法中线程的状态:  " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        ThreadState1 threadState1 = new ThreadState1();
        Thread thread = new Thread(threadState1);
        System.out.println(thread.getName() + " 构造函数后线程的状态:" + thread.getState());
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println(thread.getName() + " 方法执行完线程的状态: " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
