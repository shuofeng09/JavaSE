package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-14 18:37
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        System.out.println(t3.getName() + "当前状态: " + t3.getState());
        t3.start();


        while (Thread.State.TERMINATED != t3.getState()) {
            System.out.println(t3.getName() + "当前状态: " + t3.getState());
            Thread.sleep(500);
        }

        System.out.println(t3.getName() + "当前状态: " + t3.getState());
    }
}


class T3 extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}
