package com.alexandr.javacore;

import java.util.concurrent.Semaphore;

public class Foo {
    private static final Semaphore SECOND = new Semaphore(0);
    private static final Semaphore THIRD = new Semaphore(0);

    public void first() {
        System.out.print("first");
        SECOND.release();
    }

    public void second() {
        try {
            SECOND.acquire();
            System.out.print("second");
            THIRD.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Foo().second(): " + e);
        }
    }

    public void third() {
        try {
            THIRD.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Foo().third(): " + e);
        }
    }
}
