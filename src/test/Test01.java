package test;

/**
 * @author 朔风
 * @createTime 2022-07-06 13:01
 */
public class Test01 {

    /**
     * 测试命令行参数
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

}
