package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-31 17:36
 */
public class LocalVarTest {
    public void localvar1(){
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localvar2(){
        {
            int a = 0;
            System.out.println(a);
        }
        int b= 0;
    }

}
