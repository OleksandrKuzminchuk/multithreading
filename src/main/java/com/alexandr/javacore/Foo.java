package com.alexandr.javacore;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    private Lock lock = new ReentrantLock();

    public void first(){
        lock.lock();
        System.out.print("first");
        lock.unlock();
    }
    public void second(){
        lock.lock();
        System.out.print("second");
        lock.unlock();
    }
    public void third(){
        lock.lock();
        System.out.print("third");
        lock.unlock();
    }
}
