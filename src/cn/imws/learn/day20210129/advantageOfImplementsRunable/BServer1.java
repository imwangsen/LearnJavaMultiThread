package cn.imws.learn.day20210129.advantageOfImplementsRunable;

/**
 * @author imws
 * @date 2021/1/29 -23:13
 */
public class BServer1 extends Aserver implements Runnable {

    @Override
    public void a_save_method() {
        System.out.println("b_save_method()");
    }

    @Override
    public void run() {
        a_save_method();
    }
}
