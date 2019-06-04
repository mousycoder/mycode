package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-06-04 18:10
 */
public class ExceptionTableTest {

    public static void main(String[] args) {
        ExceptionTableTest d = new ExceptionTableTest();
        d.inc();
    }

    public int inc() {
        int x;
        try {
            x = 1;
            return x;
        } catch(Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
