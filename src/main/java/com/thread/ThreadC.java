package com.thread;

import java.util.concurrent.Callable;

public class ThreadC implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000L);
        //System.out.println("线程C");
        return "Thread C";
    }
}
