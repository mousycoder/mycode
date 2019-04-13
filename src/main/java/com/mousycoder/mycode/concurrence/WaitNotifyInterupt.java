package com.mousycoder.mycode.concurrence;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-09 17:57
 */
public class WaitNotifyInterupt {

    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("----begin-----");
                    synchronized (obj) {
                        obj.wait(1100);
                    }
                    System.out.println("-----end------");
                }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
        });

        threadA.start();

        Thread.sleep(1000);

        System.out.println("-------begin interrupt threadA-----");
        threadA.interrupt();
        System.out.println("-------end interrupt threadA -------");
    }
}
