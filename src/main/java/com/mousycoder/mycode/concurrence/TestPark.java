package com.mousycoder.mycode.concurrence;

import java.util.concurrent.locks.LockSupport;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-26 18:20
 */
public class TestPark {

    public void testPark(){
        LockSupport.park(this);
    }

    public static void main(String[] args) {
        TestPark testPark = new TestPark();
        testPark.testPark();
    }
}
