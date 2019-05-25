package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-10 16:38
 */
public class ShiftingTest1 {
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

//        int num1 = 3;
//        System.out.println(Integer.toBinaryString(num1));
//        int num2 = 3;
//        System.out.println(Integer.toBinaryString(num2));
//        System.out.println(Integer.toBinaryString(num1 & num2));
//
//        System.out.println(num1 & num2);

        int i = Integer.MAX_VALUE;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        i = i >> 1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));


        int j = -1;
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));
        j = j >>> 1;
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));










    }
}
