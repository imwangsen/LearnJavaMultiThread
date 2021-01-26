package com.imws.thread.day210126;

/**
 * @author imws
 * @date 2021/1/26 -23:49
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();//耗时大
        System.out.println("运行结束!");//耗时小

    }
}
