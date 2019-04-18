package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-16 17:15
 */
public class ThreadNotSafeCount {

    private Long value;

    public Long getValue() {
        return value;
    }

   public long ins(){
        return ++value;
   }
}
