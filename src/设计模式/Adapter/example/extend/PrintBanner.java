package 设计模式.Adapter.example.extend;

/**
 * @author 朔风
 * @createTime 2022-10-04 10:19
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWitParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
