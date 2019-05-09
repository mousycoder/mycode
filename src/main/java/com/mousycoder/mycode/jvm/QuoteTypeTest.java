package com.mousycoder.mycode.jvm;

/**
 * 引用类型
 *
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-08 17:15
 */


class Value {
    int val;
}


public class QuoteTypeTest {

    public static void main(String[] args) {
        int i1 = 3;
        int i2 = i1;
        i2 = 4;
        System.out.println("i1==" + i1);
        System.out.println("but i2 == " + i2);
        Value v1 = new Value();
        v1.val = 5;
        Value v2 = v1;
        v2.val = 6;
        System.out.println("v1.val==" + v1.val);
        System.out.println("and v2.val == " + v2.val);
    }
}
