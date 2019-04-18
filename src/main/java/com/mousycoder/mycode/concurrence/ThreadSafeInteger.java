package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 17:10
 */
public class ThreadSafeInteger {

    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
