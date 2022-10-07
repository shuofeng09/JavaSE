package 设计模式.Template.exmple;

/**
 * @author 朔风
 * @createTime 2022-10-04 23:46
 */
public class StringDisplay extends AbstractDisplay {

    private String string;
    private int width;  //以字节为单位计算字符串长度

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
