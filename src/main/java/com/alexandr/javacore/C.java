package com.alexandr.javacore;

public class C implements Runnable {
    private final Foo foo;

    public C(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.third();
    }
}
