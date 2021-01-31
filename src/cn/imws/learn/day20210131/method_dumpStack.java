package cn.imws.learn.day20210131;

/**
 * @author imws
 * @date 2021/1/31 -21:18
 */
public class method_dumpStack {

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
        int age = 0;
        age = 100;
        if (age == 100){
            Thread.dumpStack();
        }
    }

}

class main_of_dumpStack {
    public static void main(String[] args) {
        method_dumpStack method_dumpStack = new method_dumpStack();
        method_dumpStack.a();

    }
}