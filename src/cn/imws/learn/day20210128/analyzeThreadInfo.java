package cn.imws.learn.day20210128;

/**
 * @author imws
 * @date 2021/1/28 -22:53
 * 分析线程的信息
 * 查看线程的状态与信息，可采用以下常用命令
 * （三种都在jdk\bin目录下）
 *  1.jps+jstack.exe
 *      在bin目录下，cmd输入命令 jps ，
        C:\Program Files\Java\jdk1.8.0_221>cd bin
        C:\Program Files\Java\jdk1.8.0_221\bin>jps
        12964 Launcher
        15572 analyzeThreadInfo
        4148 Jps
        1208
        在bin目录下，cmd输入命令 jstack -l [进程id] ，
        C:\Program Files\Java\jdk1.8.0_221\bin>jstack -l 15572
 *  2.jmc.exe
 *  3.jvisualvm.exe
 */
public class analyzeThreadInfo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
//                    super.run();
                    try {
                        Thread.sleep(500000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
