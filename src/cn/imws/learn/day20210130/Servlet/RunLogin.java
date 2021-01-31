package cn.imws.learn.day20210130.Servlet;

/**
 * @author imws
 * @date 2021/1/31 -11:41
 */
public class RunLogin {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();


    }
}
