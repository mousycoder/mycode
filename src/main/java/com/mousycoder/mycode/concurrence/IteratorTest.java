package com.mousycoder.mycode.concurrence;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-26 17:51
 */
public class IteratorTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("hello");
        arrayList.add("test");

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
