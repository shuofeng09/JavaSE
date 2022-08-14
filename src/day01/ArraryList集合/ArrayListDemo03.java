package day01.ArraryList集合;

import java.util.ArrayList;

/**
 * @author 朔风
 * @ClassName ArrayListDemo03
 * @createTime 2022-06-16 11:17
 */
public class ArrayListDemo03 {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(3, "jack", 20));
        list.add(new User(2, "bob", 18));
        list.add(new User(1, "lily", 19));

        //排序前
        for (User user : list) {
            System.out.println(user);
        }
        System.out.println("==============");
        sort(list);
        //排序后
        for (User user : list) {
            System.out.println(user);
        }
    }

    /**
     * @Description: 从小到大排序集合(冒泡排序法)
     * @Param: ArrayList
     * @return: void
     */
    private static void sort(ArrayList<User> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出对象User
                User user1 = list.get(j);
                User user2 = list.get(j + 1);
                //对一前一后的元素进行大小判断
                if (user1.getAge() > user2.getAge()) {
                    list.set(j, user2);
                    list.set(j + 1, user1);
                }
            }
        }
    }
}
