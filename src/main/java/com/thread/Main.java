package com.thread;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        final ThreadC threadC = new ThreadC();
        FutureTask<String> futureTask = new FutureTask<String>(threadC);
        new Thread(futureTask).start();
        System.out.println("主线程：：：：：：：");
        try {
            System.out.println("线程C ：" + futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
