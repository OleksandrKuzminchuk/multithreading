package com.alexandr.javacore;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                foo.first();
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                foo.second();
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                foo.third();
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}