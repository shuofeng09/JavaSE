package day03.多线程;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 朔风
 * @createTime 2022-08-09 17:41
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        //设置线程名
        t.setName("小珍");
        //设置线程优先级
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");


        for (int i = 1; i <= 5; i++) {
            //休眠
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName()+"的优先级: "+t.getPriority());      //1
        //打断休眠(中断线程)
        t.interrupt();
    }
}

//自定义线程类
class T extends Thread {
    @Override
    public void run() {
        while (true){
            for (int i = 1; i <= 100; i++) {
                System.out.println("小珍吃包子 " + i);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                //捕获到线程被中断的异常
                System.out.println(getName() + " 被interrupt 中断线程了");
            }
        }
    }
}
