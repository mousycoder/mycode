package com.mousycoder.mycode.thread;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-03-12 10:21
 */
public class ThreadState2 implements Runnable{

    final Object lock = new Object();

    public ThreadState2(){
    }

    @Override
    public void run() {

        synchronized (lock){
            try {
                lock.wait();
                Thread.sleep(3000);
                lock.notifyAll();
            }catch (InterruptedException e){

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

    public static void main(String[] args) {
        ThreadState2 threadState1 = new ThreadState2();
        Thread thread = new Thread(threadState1);
        System.out.println(thread.getName() + " 构造函数后线程的状态:" + thread.getState());
        thread.start();
        try {
            System.out.println(thread.getName() + " 线程刚开始线程的状态: " + thread.getState());
            Thread.sleep(2000);
            System.out.println(thread.getName() + " 线程加锁中线程的状态: " + thread.getState());
            Thread.sleep(2000);
            System.out.println(thread.getName() + " 线程释放锁后线程sleep线程的状态: " + thread.getState());
            Thread.sleep(4000);
            System.out.println(thread.getName() + " 线程放锁线程sleep结束的状态: " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
