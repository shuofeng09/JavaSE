package xmut.experiment.ch2;

public class PlusTest {
    public static void main(String[] args) {
        System.out.println("This is along string that is the " +
                "concatenation of two shorter strings.");
        System.out.println("The first computer was invented about" + 55 +
                "years ago.");
        // 当“+”两边至少有一个字符串的时候，该符号被看做连接符。
        System.out.println("8 plus 5 is " + 8 + 5);
        // 如果一个表达式中包含了不只一个“+”，那么括号中的表达式具有优先计算顺序。
        // 如果没有括号，加号的计算顺序是从左至右。
        System.out.println("8 plus 5 is " + (8 + 5));
        // 当“+”两边都是操作数的时候，该符号被看做“加号”。
        System.out.println(8 + 5 + " equals 8 plus 5.");

        String s1 = new String("abc");
        String s2 = new String("abc");
    }

}
