package com.mousycoder.mycode.concurrence;

import java.util.Random;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-19 18:42
 */
public class RandomTest {

    public static void main(String[] args) {
        Random random  = new Random();
        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }
    }
}
