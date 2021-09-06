package com;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("多线程方法启动了...");
    }
}
