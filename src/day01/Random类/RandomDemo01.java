package day01.Random类;

import java.util.Random;

/**
 * @author Wishlove09
 */
public class RandomDemo01 {
    public static void main(String[] args) {
        //创建一个Random类型的对象
        Random r = new Random();
        //获取一个[0,1)的浮点数
        System.out.println(r.nextDouble());
        //获取布尔值 true or false
        System.out.println(r.nextBoolean());
        for (int i = 0; i < 9; i++) {
            //随机生成一个[0,10)的数
            int j = r.nextInt(10);
            System.out.print(j+" ");
        }
    }

}
