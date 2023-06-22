package 数据结构与算法.List;

/**
 * @author 朔风
 * @createTime 2023-04-26 15:20
 */
public class MyLinkedList {
    // 头节点指针
    private Node head;
    // 尾节点指针
    private Node last;
    // 链表的长度
    private int size;

    public void insert(int data, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("超出链表节点的范围");
        }
        Node node = new Node(data);
        if (size == 0) {
            // 空链表的情况下
            head = node;
            last = node;
        } else if (index == 0) {
            // 插入头部的情况下
            node.next = head;
            head = node;
        } else if (index == size) {
            // 插入尾部的情况下
            last.next = node;
            last = node;
        } else {
            // 插入中间
            // 获取插入点前一个位置的节点
            Node prevNode = get(index - 1);
            node.next = prevNode.next;
            prevNode.next = node;
        }
        size++;
    }

    /**
     * 获取指定位置的节点
     *
     * @param index 查找的位置
     * @return 节点
     */
    private Node get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("超出链表节点的范围");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(1, 0);
        myLinkedList.insert(2, 1);
        myLinkedList.insert(3, 2);
        myLinkedList.insert(4, 3);
        myLinkedList.insert(4, 4);

        myLinkedList.remove(3);
        myLinkedList.remove(3);

        myLinkedList.outPut();

    }

    private Node remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("超出链表节点的范围");
        }
        Node removeNode = null;
        if (index == 0) {
            // 删除头结点
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            // 删除尾节点
            removeNode = last;
            Node preNode = get(index - 1);
            preNode.next = null;
            last = preNode;
        }else {
            // 删除中间节点
            Node prevNode = get(index - 1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    private void outPut() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
