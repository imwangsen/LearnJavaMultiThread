package com.imws.thread.day210126;

/**
 * @author imws
 * @date 2021/1/26 -23:44
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 输出main，但与main方法没有任何关系
         * 仅仅相同而已
         */
        System.out.println(Thread.currentThread().getName());
    }
}
