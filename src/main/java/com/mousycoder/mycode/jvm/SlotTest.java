package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-31 17:54
 */
public class SlotTest {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
