package day01.Random类;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Wishlove09
 */
public class RandomDemo02 {
    public static void main(String[] args) {
        Random r = new Random();
        //产生一个(0,100]的随机数
        int num = r.nextInt(100);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字[0‐100)：");
            int tmp = sc.nextInt();

            if (tmp > num) {
                System.out.println("你猜的数据" + tmp + "大了");
            } else if (tmp < num) {
                System.out.println("你猜的数据" + tmp + "小了");
            } else {
                System.out.println("恭喜你,猜中了");
                break;
            }

        }
    }
}
