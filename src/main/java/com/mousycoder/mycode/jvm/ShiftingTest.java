package com.mousycoder.mycode.jvm;

import java.awt.font.NumericShaper;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-10 16:38
 */
public class ShiftingTest {
    public static void main(String[] args) {
//       int i ;
//       int num = 0xFFFFFFE;
//        System.out.println(Integer.toBinaryString(num));
//
//        for (int j = 0; j < 4; j++) {
//            num = num << 1;
//            System.out.println(Integer.toBinaryString(num));
//            System.out.println(num);
//        }
//    }

//        int i = -1;
//        System.out.println(Integer.toBinaryString(i));
//        i = i >>> 1;
//        System.out.println(Integer.toBinaryString(i) + "  " + i );

        int num1 = 3;
        System.out.println(Integer.toBinaryString(num1));
        int num2 = 3;
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(Integer.toBinaryString(num1 & num2));

        System.out.println(num1 & num2);

    }
}
