package cn.imws.learn.day20210128;

/**
 * @author imws
 * @date 2021/1/28 -22:31
 */
public class callMainMethodMainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        /**
         * note
         * 输出main，不是main方法的‘main’，同名而已
         */
    }
}
