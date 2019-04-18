package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 17:12
 */
public class ThreadSafeInteger2 {

    private volatile int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
