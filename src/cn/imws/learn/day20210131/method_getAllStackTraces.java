package cn.imws.learn.day20210131;

import java.util.Iterator;
import java.util.Map;

/**
 * @author imws
 * @date 2021/1/31 -21:21
 */
public class method_getAllStackTraces {

    public void a(){
        b();
    }
    public void b(){
        c();
    }
    public void c(){
        d();
    }
    public void d(){
        e();
    }
    public void e(){
        Map<Thread, StackTraceElement[]> threadMap = Thread.currentThread().getAllStackTraces();
        if(threadMap != null && threadMap.size() != 0){
            Iterator<Thread> keyIterator = threadMap.keySet().iterator();
            while (keyIterator.hasNext()){
                Thread eachThread = keyIterator.next();
                StackTraceElement[] array = threadMap.get(eachThread);
                System.out.println("-------每个线程的基本信息");
                System.out.println("线程名称："+eachThread.getName());
                System.out.println("StackTraceElement[].length=" + array.length);
                System.out.println("线程的状态："+eachThread.getState());
                if(array.length != 0){
                    System.out.println("输出StackTraceElement[]数组具体信息：");
                    for (int i = 0; i < array.length; i++) {
                        StackTraceElement stackTraceElement = array[i];
                        System.out.println("  "+ stackTraceElement.getClassName() + " " + stackTraceElement.getMethodName()
                        +" "+ stackTraceElement.getFileName() +" "+ stackTraceElement.getLineNumber());
                    }
                } else {
                    System.out.println("  没有StackTraceElement[]信息，因为线程 "+ eachThread.getName() +" 中的StackTraceElement[].length == 0");
                }
                System.out.println();
                System.out.println();
            }
        }
    }

}

class main_of_getAllStackTraces {
    public static void main(String[] args) {
        method_getAllStackTraces method_getAllStackTraces = new method_getAllStackTraces();
        method_getAllStackTraces.a();
    }
}