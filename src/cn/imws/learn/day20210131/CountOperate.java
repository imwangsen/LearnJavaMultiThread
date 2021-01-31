package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -16:14
 */
public class CountOperate extends Thread{

    public CountOperate() {
        System.out.println("CountOperate() --- begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());//Returns this thread's name.
        System.out.println("CountOperate() --- end");
    }

    @Override
    public void run() {
        System.out.println("run()--- begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run() --- end");
    }
}

class main {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
    }
}
