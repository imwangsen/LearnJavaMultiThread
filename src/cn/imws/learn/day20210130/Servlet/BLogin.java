package cn.imws.learn.day20210130.Servlet;

/**
 * @author imws
 * @date 2021/1/31 -11:40
 */
public class BLogin extends Thread{

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("B start()");
    }

    @Override
    public void run() {
        System.out.println("B is running....");
        LoginServlet.doPost("B_name", "B_password");
        System.out.println("B is finish");
    }
}
