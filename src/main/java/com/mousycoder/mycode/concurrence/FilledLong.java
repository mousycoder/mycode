package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-19 18:02
 */
public class FilledLong {
    public volatile long value  = 0L;

    @sun.misc.Contended("tlr")
    long threadLocalRandomSeed;

    @sun.misc.Contended("tlr")
    int threadLocalRandomProbe;

    @sun.misc.Contended("tlr")
    int threadLocalRandomSecondarySeed;



}
