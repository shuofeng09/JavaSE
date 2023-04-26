package 数据结构与算法.List;

/**
 * @author 朔风
 * @createTime 2023-04-26 13:40
 */
public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }


    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.insert(10, 0);
        myArray.insert(20, 1);
        myArray.insert(30, 2);
        myArray.insert(40, 1);

        myArray.delete(1);
        myArray.outPut();
    }

    /**
     * 指定位置删除数组的元素，并返回删除的元素
     *
     * @param index 删除的位置
     */
    private int delete(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("超出数组实际元素的范围");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return array[index];
    }

    /**
     * 在指定位置插入元素
     *
     * @param element 插入的元素
     * @param index   插入的位置
     */
    private void insert(int element, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("超出数组实际元素的范围");
        }
        if (size >= array.length) {
            resize();
        }
        // 从右往左循环，将元素逐个向右移动一位
        for (int i = size - 1; i >= index; i--) {
            this.array[i + 1] = array[i];
        }
        // 腾出的空间放入新元素
        array[index] = element;
        // 数组的长度+1
        size++;
    }

    private void resize() {
        int[] arrayNew = new int[array.length * 2];
        // 从旧数组中复制元素到新数组
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        // 让旧数组指向新数组
        array = arrayNew;
    }

    public void outPut() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
