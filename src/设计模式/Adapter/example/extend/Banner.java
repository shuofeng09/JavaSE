package 设计模式.Adapter.example.extend;

/**
 * @author 朔风
 * @createTime 2022-10-04 10:17
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWitParen() {
        System.out.println("( " + string + " )");
    }


    public void showWithAster() {
        System.out.println("* " + string + " *");
    }
}
