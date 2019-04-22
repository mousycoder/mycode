package com.mousycoder.mycode.concurrence;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-19 14:37
 */
public class TestUnsafeReflact {

    static final Unsafe unsafe;

    static final long stateOffset;

    private volatile long state = 0;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");

            field.setAccessible(true);

            unsafe = (Unsafe) field.get(null);

            stateOffset = unsafe.objectFieldOffset(TestUnSafe.class.getDeclaredField("state"));

        } catch (Exception ex){
            System.out.println(ex.getLocalizedMessage());
            throw new Error(ex);
        }
    }

    public static void main(String[] args) {
        TestUnsafeReflact test = new TestUnsafeReflact();
        Boolean success = unsafe.compareAndSwapInt(test,stateOffset,0,1);
        System.out.println(success);
    }
}
