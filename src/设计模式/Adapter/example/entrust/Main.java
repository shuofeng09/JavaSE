package 设计模式.Adapter.example.entrust;

/**
 * @author 朔风
 * @createTime 2022-10-04 10:45
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("author");

        print.printWeak();
        print.printStrong();

    }
}
