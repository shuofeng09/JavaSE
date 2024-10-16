package test;

public class TestThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("main线程");

        new Thread(() -> {
            threadLocal.set("thread线程");
        }).start();

        System.out.println(threadLocal.get());

    }
}
