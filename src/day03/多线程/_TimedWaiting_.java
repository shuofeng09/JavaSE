package day03.多线程;

import java.util.concurrent.TimeUnit;

/**
 * @author 朔风
 * @date 2023-08-12 17:58
 */
@SuppressWarnings("all")
public class _TimedWaiting_ {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyT());
        thread.start();
    }
}

class MyT implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 9999; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("线程休眠 1秒 ==> "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
