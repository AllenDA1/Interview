package com.djj.thread.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class HappyLock {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();


        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(new Object(), 1);

        AtomicReference<Object> objectAtomicReference = new AtomicReference<>();
    }
}
