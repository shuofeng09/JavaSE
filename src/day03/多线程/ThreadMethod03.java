package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-14 15:26
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread daemonThread = new MyDaemonThread();
        //设置守护线程
        daemonThread.setDaemon(true);
        //启动线程
        daemonThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("用户线程在努力的工作 " + i);
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread {
    @Override
    public void run() {
        //无限循环
        while (true) {
            System.out.println("守护线程在工作...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}