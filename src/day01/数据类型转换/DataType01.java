package day01.数据类型转换;

/**
 * @author Wishlove09
 */
public class DataType01 {
    /*
    当数据类型不一样时，将会发生数据类型转换。

    自动类型转换（隐式）
        1. 特点：代码不需要进行特殊处理，自动完成。
        2. 规则：数据范围从小到大。

    强制类型转换（显式）
    */

    public static void main(String[] args) {
        //整型
        int a = 100;
        //长整型
        long b = 100L;
        //单精度浮点数
        float c = 3.14F;
        //双精度浮点数
        double d = 5.43;

        //自动类型转换=======
        //左边为long类型，右边默认是int类型，两边的类型不一样
        //int --> long 符合数据范围大小排序 自动进行类型转换
        long e = 100;
        System.out.println(e);

        //自动类型转换=======
        //左边为double类型，右边为float类型，两边类型不一致
        //float --> double 符合数据范围大小排序 自动进行类型转换
        double f = 2.5F;
        System.out.println(f);

        //自动类型转换=======
        //左边为float类型，右边为double类型，两边类型不一致
        //long --> float 符合数据范围大小排序 自动进行类型转换
        float g = 300L;
        System.out.println(g);

        byte h = 50;
        int i = h + a;
        //byte i = h + a; //报错
        //tips：int类型和byte类型的计算结果是int类型
        System.out.println(i);


    }
}
