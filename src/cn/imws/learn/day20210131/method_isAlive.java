package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -17:24
 */

/**
 * isAlive方法的功能 是 判断当前的线程是否存活
 * 存活状态：线程已启动，且尚未终止的状态 即 活跃状态[线程 处于 正在运行 或 准备开始运行 的 状态]
 */
public class method_isAlive {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();
        System.out.println("before == " + myThread3.isAlive());
        myThread3.start();
        //Thread.sleep(1000);
        System.out.println("end == " + myThread3.isAlive());
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
