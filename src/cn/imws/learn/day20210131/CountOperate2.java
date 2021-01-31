package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -17:50
 */
public class CountOperate2 extends Thread{

    public CountOperate2() {
        System.out.println("CountOperate() --- begin");

        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());

        /**
         * 关键字this 代表this所在类 的 对象
         */
        System.out.println("this.getName()="+this.getName());//Returns this thread's name.
        System.out.println("this.isAlive()="+this.isAlive());

        System.out.println("CountOperate() --- end");
    }

    @Override
    public void run() {
        System.out.println("run()--- begin");

        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());

        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());

        System.out.println("run() --- end");
    }
}

class main2 {
    public static void main(String[] args) {
        CountOperate2 c = new CountOperate2();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
