package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-31 16:16
 */
public class TestStatckDeep1 {

    private static int count = 0;
    public static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
        }
    }
}
