package com.mousycoder.mycode.jvm;

/**
 * 下划线表示数值字面量
 *
 * @Author: mousycoder
 * @Date: 2019-01-07 11:13
 * @Version 1.0
 */
public class MutilCatch {

    public static void main(String[] args) {
        long a = 10_000_000L;
        int b = 0b0000_0000_0000_1000;
        System.out.println(b);
        int x = 0;
        int y = 0;

        try {
            x = x / y;
        } catch (ArithmeticException  | NumberFormatException e ){
            System.out.println("d");
        }


    }
}
