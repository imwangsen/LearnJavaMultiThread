package cn.imws.learn.day20210129;

import cn.imws.constants.Nums;

import java.security.PublicKey;

/**
 * @author imws
 * @date 2021/1/29 -19:51
 * 1
 */
/**
 * 线程执行start()方法的顺序，不代表执行run()方法的顺序
 */
public class startTimeIsNotRunTime {
    public static void main(String[] args) {

        MyThread[] threads = new MyThread[Nums._20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new MyThread(i);
        }

        for (int i = 0; i < 20; i++) {
            threads[i].start();
        }

    }
}

/**
 * 启动一个线程后，JVM直接调用MyThread类中的run()方法
 * myThread.start()
 */
class MyThread extends Thread {

    private int i;

    public MyThread(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
