package day01.ArraryList集合;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Wishlove09
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "alan", 18));
        list.add(new User(2, "jack", 19));
        list.add(new User(3, "lily", 20));
        //1.Collection接口遍历元素 - for循环
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=====================");
        //2.Collection接口遍历元素 - for循环增强版（简化版iterator）
        for (User user : list) {
            System.out.println(user);
        }
        System.out.println("=====================");
        //3.Collection接口遍历元素 - iterator迭代器
        //快速生成 while => itit
        //显示所有的快捷键的的快捷键 ctrl + j
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=====================");


    }
}
