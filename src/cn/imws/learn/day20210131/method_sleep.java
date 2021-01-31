package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -18:09
 */
public class method_sleep {
    public static void main(String[] args) throws InterruptedException {
//        method1();
//        method2();
        sleep_with_nanos();

    }

    public static void method1(){
        MyThread_s1 myThread_s1 = new MyThread_s1();

        System.out.println("begin = "+ System.currentTimeMillis());
        myThread_s1.run();//直接调用run 走main线程
        System.out.println("end = "+ System.currentTimeMillis());
    }

    public static void method2(){
        MyThread_s2 myThread_s2 = new MyThread_s2();

        System.out.println("begin = "+ System.currentTimeMillis());
        myThread_s2.start();
        System.out.println("end = "+ System.currentTimeMillis());
    }

    public static void sleep_with_nanos() throws InterruptedException {
        long beginMillis = System.currentTimeMillis();
        System.out.println("begin = "+ System.currentTimeMillis());
        Thread.currentThread().sleep(2000,999999);
        System.out.println("end = "+ System.currentTimeMillis());
        long endMillis = System.currentTimeMillis();
        System.out.println(endMillis-beginMillis);

    }

}

class MyThread_s1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class MyThread_s2
        extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName() + " begin= "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName() + " end= "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}