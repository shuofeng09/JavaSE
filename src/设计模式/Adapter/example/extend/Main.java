package 设计模式.Adapter.example.extend;

/**
 * @author 朔风
 * @createTime 2022-10-04 10:23
 */
public class Main {
    public static void main(String[] args) {

        /* 注意：PrintBanner类的实例被保存在Print类型的变量中 */
        Print print = new PrintBanner("hello");

        /* 我们调用的方法是Print接口中具有的方法，而Banner类的中具有的方法被完全隐藏起来了 */
        print.printWeak();
        print.printStrong();
    }
}
