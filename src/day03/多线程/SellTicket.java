package day03.多线程;

/**
 * @author 朔风
 * @Description: 模拟售票窗口
 * @createTime 2022-08-09 00:14
 */
public class SellTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        //模拟三个窗口
        Thread thread01 = new Thread(ticket, "窗口一");
        Thread thread02 = new Thread(ticket, "窗口二");
        Thread thread03 = new Thread(ticket, "窗口三");

        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class Ticket implements Runnable {
    private static int nums = 100;

    @Override
    public void run() {
        while (true) {
            if (nums > 0) {
                //模拟出票时间
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //买票操作
                System.out.println(Thread.currentThread().getName() + " 正在卖票，还剩 " + nums-- + " 张");
            } else {
                break;
            }
        }
    }
}
