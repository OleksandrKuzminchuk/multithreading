package com.alexandr.javacore;

public class A implements Runnable {
    private final Foo foo;

    public A(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.first();
    }
}
