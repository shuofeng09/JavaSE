package day01.数据类型转换;

/**
 * @author Wishlove09
 */
public class DataType02 {

    /*
强制类型转换
	1. 特点：代码需要进行特殊的格式处理，不能自动完成。
	2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;

注意事项：
	1. 强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。
	2. byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
	3. byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
	4. boolean类型不能发生数据类型转换
*/

    public static void main(String[] args) {
        //左边是int类型，右边为long类型，前后不一致
        //long --> int 不符合自动类型转换规则
        int a = (int) 100L;
        System.out.println(a);


        //long类型强者转换为int类型
        int b = (int) 100000000000L;
        System.out.println(b);

        //double类型强制转换为int类型
        int c = (int) 3.141596;
        //此处会将小数点后面的位数全部去掉
        System.out.println(c);

        char d = 'a';
        //当字符进行数学运算的时候，计算机底层会将字符转化为ASCII码
        System.out.println(b + 1);

        byte e = 10;
        byte g = 20;
        int result = e + g;
        //byte + byte ---> int + int = int
        System.out.println(result);

        short h = 20;
        short result2 = (short) (h + g);
        //byte + short --> int + int = int
        System.out.println(result2);

    }
}
