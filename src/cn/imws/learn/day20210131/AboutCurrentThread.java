package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -16:09
 */
public class AboutCurrentThread {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
//        myThread2.run();
    }
}

class MyThread2 extends Thread {

    public MyThread2() {
        System.out.println("MyThread2()构造方法 " + Thread.currentThread().getName());
    }


    @Override
    public void run() {
        System.out.println("run() " + Thread.currentThread().getName());
    }
}