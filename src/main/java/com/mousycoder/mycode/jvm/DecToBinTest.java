package com.mousycoder.mycode.jvm;

import java.util.Scanner;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-30 16:34
 */
public class DecToBinTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入一个整数:");
        int x = in.nextInt();

        int n = 0;
        int i = 31;
        int j = 0;
        int a[] = new int[32];


        if (x < 0){
            x = -x;
            j = 1;
        }
        while ( x > 0.5) {
            n = x % 2;
            x = (x - n) /2;
            a[i] = n;
            i = i -1;
        }
        if (j == 1) {
            System.out.print("-");
        }
        else {
            System.out.print("+");
        }
        for (int k = 0; k < 32; ) {
            for (int l = 0; l < 4; l++){
                System.out.print(a[k]);
                k ++;
            }
            if (k != 32){
                System.out.print(" ");
            }
        }

        System.out.print("\n");

    }
}
