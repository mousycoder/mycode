package com.mousycoder.mycode.concurrence;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-22 17:04
 */
public class RandomMultiThreadTest {

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 10; ++i) {
            System.out.println(random.nextInt(5));
        }
    }
}
