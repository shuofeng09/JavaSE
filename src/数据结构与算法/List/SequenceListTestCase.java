package 数据结构与算法.List;

/**
 * @author 朔风
 * @createTime 2022-07-30 14:48
 */
public class SequenceListTestCase {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        //插入测试
        sl.insert("小珍");
        sl.insert("小张",1);
        sl.insert("小杰");
        sl.insert("小珍珠");
        //测试获取
        System.out.println("获取: "+sl.get(1));
        //测试删除
        System.out.println("删除: "+sl.remove(3));
        //测试遍历
        for (String s : sl) {
            System.out.print(s+" ");
        }
        //测试清空
        sl.clear();
        System.out.println("\n"+"清空线性表: "+sl.length());
    }
}
