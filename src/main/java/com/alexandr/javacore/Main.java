package com.alexandr.javacore;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture.runAsync(foo::third, executorService);
        CompletableFuture.runAsync(foo::second, executorService);
        CompletableFuture.runAsync(foo::first, executorService);
        executorService.shutdown();
    }
}