package cn.imws.learn.day20210129.advantageOfImplementsRunable;

/**
 * @author imws
 * @date 2021/1/29 -23:23
 */

/**
 * Thread类本身也实现了Runable
 */
public class extraIdea {
    public static void main(String[] args) {

        isThreadNotRunable isThreadNotRunable = new isThreadNotRunable();
        //isThreadNotRunable是Thread的子类，而Thread是Runable的实现类
        //故isThreadNotRunable也相当于Runable的实现类
        Thread thread = new Thread(isThreadNotRunable);
        thread.start();



    }
}

class isThreadNotRunable extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("isThreadNotRunable is run");
    }
}
