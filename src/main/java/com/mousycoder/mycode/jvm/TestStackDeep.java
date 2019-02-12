package com.mousycoder.mycode.jvm;

/**
 * 测试栈的深度
 *
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-02-12 15:43
 */
public class TestStackDeep {

    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }

    }
}
