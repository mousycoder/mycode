package com.mousycoder.mycode.jvm;

import org.apache.tools.ant.types.selectors.SizeSelector;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-30 14:46
 */
public class FloatTest2 {

    public static void main(String[] args) {
//        float f1 = 34.6f;
//        float f2 = 34.5f;
//        System.out.println(f1-f2);
//
//        double f3 = 34.6;
//        double f4 = 34.5;
//        System.out.println(f1-f2);
        byte i = -9;
        System.out.println(Arrays.toString(getBooleanArray(i)));
    }

    public static byte[] getBooleanArray(byte b) {
        byte[] array = new byte[8];
        for (int i = 7; i >= 0; i--) {
            array[i] = (byte)(b & 1);
            b = (byte) (b >> 1);
        }
        return array;
    }
}
