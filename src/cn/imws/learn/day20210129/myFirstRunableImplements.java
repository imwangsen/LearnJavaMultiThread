package cn.imws.learn.day20210129;

/**
 * @author imws
 * @date 2021/1/29 -22:42
 */

/**
 * 实现Runable接口
 * <p>Java是单继承，如若当前类已有父类，则不能再继承Thread，则可通过实现Runable接口来解决
 */
public class myFirstRunableImplements {

    public static void main(String[] args) {
        execute();
    }

    public static void execute(){
        myRunable01 myRunable01 = new myRunable01();
        Thread thread = new Thread(myRunable01);
        thread.start();
        System.out.println("execute finish.");
    }

}

class myRunable01 implements Runnable{
    @Override
    public void run() {
        System.out.println("myRunable01 is running...");
    }
}
