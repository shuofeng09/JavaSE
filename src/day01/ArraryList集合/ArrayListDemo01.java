package day01.ArraryList集合;

import java.util.ArrayList;

/**
 * @author Wishlove09
 */
public class ArrayListDemo01 {

    public static void main(String[] args) {
        //创建一个大小可变的数组 ArrayList<E>
        //E代表Element单词的首字母，需要存储哪种引用类型的元素就填写哪种引用类型
        //List集合中的元素有序（即添加和取出的顺序一致），可重复

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合添加元素
        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "孙权";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);


        //常用方法和遍历
        //get()方法获取指定位置的元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        //size()方法返回集合元素的个数
        System.out.println("size:"+list.size());
        //remove()方法删除指定位置的元素并返回被删除的元素或者指定删除哪个元素
        System.out.println(list.remove(1));
        //查找元素是否存在
        System.out.println(list.contains("曹操"));
        //判断集合是否为空
        System.out.println(list.isEmpty());
        //添加多个元素
        list.addAll(list);
        System.out.println(list);
        //替换指定位置的元素
        list.set(2, "诸葛亮");
        System.out.println(list);
        //返回指定元素首次出现在集合中的位置
        System.out.println(list.indexOf("诸葛亮"));
        //返回指定元素最后一次出现在集合中的位置
        System.out.println(list.lastIndexOf("孙权"));
        //subList(int fromIndex, int toIndex):返回从 [fromIndex,toIndex) 位置的子集合
        System.out.println(list.subList(1,3));
        //清空集合
        list.clear();
        System.out.println(list);
        //删除多个集合，删除指定元素
        list.removeAll(list);


    }



}
