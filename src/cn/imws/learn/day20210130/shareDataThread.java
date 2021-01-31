package cn.imws.learn.day20210130;

/**
 * @author imws
 * @date 2021/1/30 -17:32
 */

/**
 * p19
 */
public class shareDataThread {
    public static void main(String[] args) {
        myThread2 myThread2 = new myThread2();
        Thread a = new Thread(myThread2,"A");
        Thread b = new Thread(myThread2,"B");
        Thread c = new Thread(myThread2,"C");
        Thread d = new Thread(myThread2,"D");
        Thread e = new Thread(myThread2,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

class myThread2 extends Thread {
    private int count = 5;

    public myThread2(){
        super();
    }

    /**
     * <p>synchronized 可以对任意对象及方法加锁
     * <p>加锁的这段代码称为“互斥区”或“临界区”
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由"+ this.currentThread().getName() + " 计算,count="+count);
    }
}
