package com.mousycoder.mycode.concurrence;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @version 1.0
 * @author: mousycoder
 * @date: 2019-04-27 18:38
 */
public class NonReentrantLock implements Lock, Serializable {


    private static class Sync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }

        @Override
        public boolean tryAcquire(int acquires){
            assert acquires == 1;
            if (compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

    }



    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
