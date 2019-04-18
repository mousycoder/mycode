package com.mousycoder.mycode.concurrence;

import sun.misc.Unsafe;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 17:38
 */
public class TestUnSafe {

     static final Unsafe unsafe = Unsafe.getUnsafe();

     static final long stateOffSet = 0 ;

     private volatile static long state;


}
