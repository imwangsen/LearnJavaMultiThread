package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -21:39
 */
public class method_getId {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(" 线程名称：" + thread.getName() + " 线程ID：" + thread.getId());
    }
}
