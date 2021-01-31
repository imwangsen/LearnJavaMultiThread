package cn.imws.learn.day20210130.Servlet;

/**
 * @author imws
 * @date 2021/1/30 -18:38
 */

/**
 * 本类模拟成一个Servlet组件
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;
            if(username.equals("A_name")){
                Thread.sleep(5000);
                System.out.println("A after sleep username=" + usernameRef + " password=" + passwordRef);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
