package 设计模式.Template.exmple;

/**
 * @author 朔风
 * @createTime 2022-10-04 23:43
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this.ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
