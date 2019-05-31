package com.mousycoder.mycode.jvm;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-05-31 16:10
 */
public class SimpleHeap {

    private int id;

    public SimpleHeap(int id){
        this.id  = id;
    }

    public void show(){
        System.out.println("my id is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
