package day02.LinkedList集合;

/**
 * @author 朔风
 * @createTime 2022-07-28 01:36
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node jie = new Node("jie");

        //连接三个结点
        jack.next = tom;
        tom.prev = jack;
        tom.next = jie;
        jie.prev = tom;
        //定义头结点
        Node first = jack;
        //定义尾结点
        Node last = jie;
        //遍历: 从头到尾
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
        System.out.println("-------------------");
        //遍历: 倒叙
        while (last != null) {
            System.out.println(last);
            last = last.prev;
        }
        System.out.println("-------------------");
        //插入一个结点，在tom和jie之间插入
        Node xz = new Node("xz");
        xz.prev = tom;
        xz.next = jie;
        tom.next = xz;
        jie.prev = xz;
        //让first重新指向首结点
        first = jack;
        //遍历输出
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    //存放数据
    public Object item;
    //指向下一个结点
    public Node next;
    //指向上一个结点
    public Node prev;
    
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
