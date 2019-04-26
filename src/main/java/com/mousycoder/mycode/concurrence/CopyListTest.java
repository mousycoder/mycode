package com.mousycoder.mycode.concurrence;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-26 17:53
 */
public class CopyListTest {

    private static volatile CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        arrayList.add("hello");
        arrayList.add("ali");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("hangzhou");

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayList.set(1,"baba");
                arrayList.remove(2);
                arrayList.remove(3);
            }
        });

        Iterator<String> itr = arrayList.iterator();

        threadOne.start();

        threadOne.join();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
