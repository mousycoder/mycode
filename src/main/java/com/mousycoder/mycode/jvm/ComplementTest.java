package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-09 15:34
 */
public class ComplementTest {


    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>>i) >>> (31-i);
            System.out.print(t);
        }
    }
}
