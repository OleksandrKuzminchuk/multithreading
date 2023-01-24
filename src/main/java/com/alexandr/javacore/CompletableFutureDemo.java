package com.alexandr.javacore;

import java.util.concurrent.*;

public class CompletableFutureDemo implements Runnable {
    Foo foo = new Foo();
    Runnable a = new A(foo);
    Runnable b = new B(foo);
    Runnable c = new C(foo);

    @Override
    public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            CompletableFuture.runAsync(c, executorService);
            CompletableFuture.runAsync(b, executorService);
            CompletableFuture.runAsync(a, executorService);
        }finally {
            executorService.shutdown();
        }
    }
}
