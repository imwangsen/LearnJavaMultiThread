package cn.imws.learn.day20210130.Servlet;

/**
 * @author imws
 * @date 2021/1/31 -11:38
 */
public class ALogin extends Thread{

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("A start()");
    }

    @Override
    public void run() {
        System.out.println("A is running....");
        LoginServlet.doPost("A_name","A_password");
        System.out.println("A is finish");
    }
}
