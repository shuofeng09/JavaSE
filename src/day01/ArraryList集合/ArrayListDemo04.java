package day01.ArraryList集合;

import java.util.ArrayList;

/**
 * @author 朔风
 * @createTime 2022-06-17 10:40
 */
public class ArrayListDemo04 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        //向集合添加10个元素
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //输出当前集合
        System.out.println(list);

        //再次向集合添加5个元素
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        //输出当前集合
        System.out.println(list);


        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);


    }
}
