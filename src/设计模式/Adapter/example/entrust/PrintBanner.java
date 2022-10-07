package 设计模式.Adapter.example.entrust;

/**
 * @author 朔风
 * @createTime 2022-10-04 10:43
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String s) {
        banner = new Banner(s);
    }


    @Override
    public void printWeak() {
        banner.showWitParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
