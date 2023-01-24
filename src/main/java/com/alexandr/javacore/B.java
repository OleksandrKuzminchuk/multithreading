package com.alexandr.javacore;

public class B implements Runnable {
    private final Foo foo;

    public B(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.second();
    }
}
