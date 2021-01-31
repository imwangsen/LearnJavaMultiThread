package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -21:03
 */
public class method_getStackTrace {

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
        StackTraceElement[] array = Thread.currentThread().getStackTrace();
        if (array != null){
            for (int i = 0; i < array.length; i++) {
                StackTraceElement traceElement = array[i];
                System.out.println("className = " + traceElement.getClassName()
                        + "  |  methodName = " + traceElement.getMethodName()
                        + "  |  fileName = " + traceElement.getFileName()
                        + "  |  lineNumber = " + traceElement.getLineNumber()
                );
            }
        }
    }
}

class main_of_getStackTrace {
    public static void main(String[] args) {
        method_getStackTrace method_getStackTrace = new method_getStackTrace();
        method_getStackTrace.a();
    }
}

