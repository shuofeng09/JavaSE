package 数据结构与算法.Queue;

/**
 * @author 朔风
 * @createTime 2023-06-22 12:35
 */
public class MyQueue {

    private int[] array;
    private int front;
    private int rear;


    public MyQueue(int capacity) {
        array = new int[capacity];
        rear = 0;
        front = 0;
    }

    /**
     * 入队操作
     *
     * @param element
     * @throws Exception
     */
    public void enQueue(int element) throws Exception {
        // 判断队列情况
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        // 入队
        array[rear] = element;
        // 队尾指针向后移动一位
        rear = (rear + 1) % array.length;
    }

    /**
     * 出队操作
     *
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception {

        // 接收队头元素
        int ele = array[front];
        // 出队
        front = (front + 1) % array.length;
        return ele;
    }

    // 输出队列情况
    public void output() {
        for (int i = front; i!=rear; i = (i+1)%array.length) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) throws Exception {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);

        myQueue.deQueue();

        myQueue.output();
    }


}
