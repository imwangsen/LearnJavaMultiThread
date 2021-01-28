package cn.imws.learn.day20210128;

/**
 * @author imws
 * @date 2021/1/28 -22:40
 */
public class exceTimeOrder {
    public static void main(String[] args) throws InterruptedException {
        myThread myThread = new myThread();
        myThread.start();
        System.out.println(myThread.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(200);
        System.out.println("执行结束");
        /**
         * 使start()方法来启动一个线程，线程启动后会自动调用线程对象中的run()方法
         * run()方法中的代码就是线程对象要执行的任务，是线程执行的入口。
         *
         * start()方法执行，步骤如下(这些步骤耗时)：
         * 1.需通过JVM告诉操作系统创建Thread
         * 2.操作系统开辟内容并使用Windows SDK中的 createThread()函数 创建Thread线程对象
         * 3.操作系统对Thread对象进行调度，已确定执行的时机
         * 4.Thread在操作系统中被成功执行
         *
         */

    }
}

class myThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("myThread is running...");
    }
}
