package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-08 23:45
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog对象并没有start方法，需要通过Thread类调用
        //创建Thread对象
        Thread thread = new Thread(dog);
        thread.start();

    }
}

class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪汪 " + ++count + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }
        }
    }
}