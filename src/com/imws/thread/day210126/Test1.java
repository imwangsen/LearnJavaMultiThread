package com.imws.thread.day210126;

/**
 * @author imws
 * @date 2021/1/26 -23:40
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
