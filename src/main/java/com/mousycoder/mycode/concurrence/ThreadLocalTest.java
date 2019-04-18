package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-13 18:54
 */
public class ThreadLocalTest {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();


    static void print(String str) {
        System.out.println(str + " : " + localVariable.get());
        localVariable.remove();
    }


    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadOne local variable");
                print("threadOne");
                System.out.println("threadOne remove after " + " : " + localVariable.get());
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("threadTwo local variable");
                print("threadTwo");
                System.out.println("threadTwo remove after " + " : " + localVariable.get() );
            }
        });

        threadOne.start();
        threadTwo.start();

    }





}
