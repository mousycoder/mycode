package com.mousycoder.mycode.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: mousycoder
 * @Date: 2018-12-28 09:37
 * @Version 1.0
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
