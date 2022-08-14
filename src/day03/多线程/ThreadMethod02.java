package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-14 15:27
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了 "+i+" 包子");
            if (i == 5) {
                System.out.println("子线程来了，让子线程先吃");
                t2.start();
                //线程插队
                t2.join();
                System.out.println("子线程吃完包子，主线程接着吃");
            }
        }
    }
}
class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("子线程吃包子 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}