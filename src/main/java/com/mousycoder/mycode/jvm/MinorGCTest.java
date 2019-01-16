package com.mousycoder.mycode.jvm;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @Author: mousycoder
 * @Date: 2018-12-28 11:04
 * @Version 1.0
 */
public class MinorGCTest {

    private static final int _1MB = 1024 * 1024;

    public static void testAllocation(){
        BigDecimal bigDecimal = new BigDecimal("9.00");
        NumberFormat nf = NumberFormat.getInstance();
        nf.format(bigDecimal);
        System.out.println(bigDecimal);


        BigDecimal a=new BigDecimal("9.01");
        System.out.println(a.stripTrailingZeros().toPlainString());


        byte[] allocation1, allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
