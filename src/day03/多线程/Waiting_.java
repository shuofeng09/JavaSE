package day03.多线程;

/**
 * @author 朔风
 * @date 2023-08-16 21:49
 */
@SuppressWarnings("all")
public class Waiting_ {

    private static Object obj = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "==获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            // 无限等待
                            obj.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "==从waiting状态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "==等待10秒");
                        // 无限等待
                        Thread.sleep(10 * 1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "==获取到锁对象，调用notify方法，释放锁对象");
                        obj.notify();
                    }
                }
            }
        }, "唤醒线程").start();


    }

}
