package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-31 17:58
 */
public class GcTest {

    public void localvarGc1(){
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
    }

    public void localvarGc2(){
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    public void localvarGc3(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarGc4(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    public void localvarGc5(){
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        GcTest i  = new GcTest();
        i.localvarGc5();
    }
}
