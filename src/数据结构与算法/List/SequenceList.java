package 数据结构与算法.List;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author 朔风
 * @createTime 2022-07-30 13:59
 */
public class SequenceList<T> implements Iterable<T> {
    //存储元素的数组
    private T[] elem;
    //记录线性表的长度
    private int size;

    //构造方法
    public SequenceList(int num) {
        this.elem = (T[]) new Object[num];
    }

    //清空线性表
    public void clear() {
        //清空线性表只需要将长度设置为0即可
        this.size = 0;
    }

    //获取线性的长度
    public int length() {
        return this.size;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty() {
        return this.size == 0;
    }

    //获取指定位置的元素
    public T get(int i) {
        if (i >= size || i < 0)
            throw new RuntimeException("当前元素不存在！");
        return this.elem[i];
    }

    //向线性表中添加元素T(后插)
    public void insert(T t) {
        //判断记录的长度与数组的长度是否相等
        if (this.size == elem.length)
            throw new RuntimeException("当前线性表已满");
        elem[size++] = t;
    }

    //往i处插入元素(前插)
    public void insert(T t, int i) {
        if (this.size == elem.length)
            throw new RuntimeException("当前线性表已满");
        if (i > this.size || i < 0)
            throw new RuntimeException("插入的位置不合法！");
        for (int index = this.size; index > i; index--) {
            //把i的位置空出来，后续元素往后移动一位
            elem[index] = elem[index - 1];
        }
        //把t元素放进i位置
        elem[i] = t;
        //新插入一个元素，长度+1
        this.size++;
    }

    //删除指定位置的元素，并返回该元素
    public T remove(int i) {
        if (i >= size || i < 0)
            throw new RuntimeException("当前元素不存在！");
        T t = elem[i];
        for (int index = i; index < this.size - 1; index++) {
            //将i位置后面的元素依次往前移动一位
            elem[index] = elem[index + 1];
        }
        //删除元素完成后线性表的长度-1
        this.size--;
        return t;
    }

    //按值查找，查找第一次出现元素t的位置
    public int indexOf(T t) {
        if (t == null)
            throw new RuntimeException("查找的元素不合法");
        for (int i = 0; i < this.size - 1; i++) {
            //如果第一次找到元素t，则返回t元素的位置
            if (elem[i].equals(t))
                return i;
        }
        //没找到就返回-1
        return -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int cur;

        public SIterator() {
            this.cur = 0;
        }

        @Override
        public boolean hasNext() {
            return cur < size;
        }

        @Override
        public T next() {
            return elem[cur++];
        }
    }
}
