package com.mousycoder.mycode.concurrence;

import java.util.concurrent.locks.LockSupport;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-26 18:08
 */
public class LockSupportTest1 {
    public static void main(String[] args) {
        System.out.println("begin park!");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("end park!");
    }
}
