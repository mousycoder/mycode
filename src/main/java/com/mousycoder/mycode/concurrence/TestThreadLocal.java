package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 16:16
 */
public class TestThreadLocal {

    public static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello world");
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread: " + threadLocal.get());

            }
        });

        thread.start();

        System.out.println("main : "  + threadLocal.get());
    }
}
