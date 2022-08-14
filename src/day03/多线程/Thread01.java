package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-08 22:38
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建cat对象，当做一个线程
        Cat cat = new Cat();

        //run()方法是一个普通的方法，没有真正启动一个线程，会把run()方法当作普通方法执行结束才往下执行
        //cat.run();

        //启动线程 -> 最终调用run()方法
        cat.start();

        /*
        * (1) public synchronized void start() { start0(); }
        * (2) start0() 是本地方法，是 JVM 调用, 底层是 c/c++实现
        * 真正实现多线程的效果，是 start0(), 而不是 run
        * private native void start0();
        *
        * */


        //说明：当main线程启动一个子线程 Thread-0时，主线程不会阻塞，会继续执行
        //这时主线程和子线程是交替执行的
        for (int i = 0; i < 10; i++) {
            System.out.println("main执行中 " + i + " " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    int count = 0;

    //重写run方法，写上自己的业务逻辑
    @Override
    public void run() {
        while (true) {
            //业务逻辑
            System.out.println("喵喵喵 " + ++count + " " + Thread.currentThread().getName());
            try {
                //让线程休眠1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 30) {
                break;
            }
        }
    }
}
