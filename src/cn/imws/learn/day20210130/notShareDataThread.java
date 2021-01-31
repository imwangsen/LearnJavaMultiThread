package cn.imws.learn.day20210130;

/**
 * @author imws
 * @date 2021/1/30 -16:49
 */
public class notShareDataThread {
    public static void main(String[] args) {
        myThread a = new myThread("A");
        myThread b = new myThread("B");
        myThread c = new myThread("C");
        a.start();
        b.start();
        c.start();
    }
}

class myThread extends Thread {
    private int count = 5;

    public myThread(String name){
        super();
        this.setName(name);//设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0){
            count--;
            System.out.println("由"+ this.currentThread().getName() + " 计算,count="+count);
        }
    }
}
