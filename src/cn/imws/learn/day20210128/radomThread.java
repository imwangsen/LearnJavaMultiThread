package cn.imws.learn.day20210128;

import java.util.Map;

/**
 * @author imws
 * @date 2021/1/28 -23:33
 */

/**
 * 线程随机性的展现
 * 如果调用thread.run()而不是thread.start()，那就不算异步执行，而是同步执行
 * 那么此线程thread对象并不交给"线程规划器"处理，而是由main主线程来调用run()方法
 * 如若使用run(),由main线程调用,则顺序执行，即同步执行
 *
 * 多线程 随机输出， 原因->CPU将时间片分给不同的线程， 线程获得时间片后就执行任务，交替执行并输出。
 * 时间片即CPU分配给各个程序的时间。
 * 注：CPU在不同线程上进行切换是需要耗时的，所以并<b>不</b>是线程越多，运行效率就更高！
 */
public class radomThread {
    public static void main(String[] args) {
        myRadmonThread myRadmonThread = new myRadmonThread();
        myRadmonThread.setName("myRadmonThread");
        myRadmonThread.start();
        //myRadmonThread.run();

        for (int i = 0; i < 10000; i++) {
            System.out.println("main=" + Thread.currentThread().getName());
        }

    }
}

class myRadmonThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("run=" + Thread.currentThread().getName());
        }
    }
}
