package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -15:54
 */
public class sameNum {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        Thread thread4 = new Thread(myThread);
        Thread thread5 = new Thread(myThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i="+ (i--) + " threadName="+ Thread.currentThread().getName());
    }
}
