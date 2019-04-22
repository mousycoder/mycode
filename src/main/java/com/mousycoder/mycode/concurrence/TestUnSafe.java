package com.mousycoder.mycode.concurrence;

import sun.misc.Unsafe;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 17:38
 */
public class TestUnSafe {

    static final Unsafe unsafe = Unsafe.getUnsafe();

    static final long stateOffSet ;

    private volatile long state = 0;

    static {
        try {
            stateOffSet = unsafe.objectFieldOffset(TestUnSafe.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            System.out.println(e.getLocalizedMessage());
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        TestUnSafe test = new TestUnSafe();
        Boolean sucess = unsafe.compareAndSwapInt(test, stateOffSet, 0, 1);
        System.out.println(sucess);
    }

}
