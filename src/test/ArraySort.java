package test;

/**
 * @author xz
 * @createTime 2022-06-15 11:47
 */
public class ArraySort {
    // 无序数组
    static int[] arr = new int[10];

    //选择排序      时间复杂度： O(n)=n^2
    static void selectionSort() {
        int len = arr.length;
        // 标记下标
        int index;
        for (int i = 0; i < len - 1; i++) {
            // 标记前一个数
            index = i;
            // 与后面剩余的其他数依次做比较
            for (int j = i + 1; j < len; j++) {
                // 如果被标记的数比较大，则交换两数的位置
                if (arr[j] < arr[index]) {
                    arr[j] ^= arr[index];
                    arr[index] ^= arr[j];
                    arr[j] ^= arr[index];
                }
            }
        }
        System.out.print("选择排序----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort() {    //冒泡排序        时间复杂度： O(n)=n^2
        int len = arr.length;
        // 循环n-1趟
        for (int i = 0; i < len - 1; i++) {
            // 每一趟移除已经排序过的，取剩下未排序的进行比较
            for (int j = 0; j < len - 1 - i; j++) {
                // 如果前面一个数比后面一个数大，交换两个数的位置
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
        }
        System.out.print("冒泡排序----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionSort() {    //插入排序               时间复杂度： O(n)=n^2
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            // 取得后一个数
            int key = arr[i];
            int j = i - 1;
            // 与前一个做比较，如果大于后面的数，则把前一个数插入到后面的位置
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // 如果前面一个数小于后面一个数，key就往后移动一位
            arr[j + 1] = key;
        }
        System.out.print("插入排序----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //希尔排序             时间复杂度： O(n)=nlogn
    static void shellSort() {
        int len = arr.length;
        int temp;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                // 获取以 gap 为间隔的前一个值
                int preIndex = i - gap;
                // 比较以 gap 为间隔的两个数，若前一个数比较大
                while (preIndex >= 0 && arr[preIndex] > temp) {
                    // 将前一个数赋值给后一个数
                    arr[preIndex + gap] = arr[preIndex];
                    // 若 preIndex < 0 ,则 arr[] 将会溢出，此时结束循环体
                    preIndex -= gap;
                }
                // 由于 preIndex -= gap 这里的 arr[preIndex + gap] 其实等于 arr[preIndex] 所以要将后面一个值赋值给 arr[preIndex] ，以作交换
                arr[preIndex + gap] = temp;
            }
            // 将间隔 gap 缩小一半，直到为 0
            gap /= 2;
        }
        System.out.print("希尔排序----");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //快速排序       时间复杂度： O(n)=nlogn
    static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args) {
        int a = 10;
        int[] c = new int[arr.length];
        for (int i = 0; i < a; i++) {
            int number = (int) (Math.random() * 90 + 10);
            arr[i] = number;
            c[i] = number;
        }
        System.out.print("随机数组arr1:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
        System.out.print("随机数组arr2:");
        for (int k : c) {
            System.out.print(k + " ");
        }
        System.out.println("");

        long startTimeOne = System.nanoTime();
        //选择排序
        selectionSort();
        long endTimeOne = System.nanoTime();

        System.out.println("");

        long startTimeTwo = System.nanoTime();
        //冒泡排序
        bubbleSort();
        long endTimeTwo = System.nanoTime();

        System.out.println("");

        long startTimeThree = System.nanoTime();
        //插入排序
        insertionSort();
        long endTimeThree = System.nanoTime();

        System.out.println("");

        long startTimeFour = System.nanoTime();
        shellSort();
        long endTimeFour = System.nanoTime();

        System.out.println("");

        long startTimeFive = System.nanoTime();
        //快速排序
        quickSort(c, 0, c.length - 1);
        long endTimeFive = System.nanoTime();

        System.out.print("快速排序----");
        for (int j : c) {
            System.out.print(j + " ");
        }
        System.out.println("");
        System.out.println("选择排序程序运行时间：" + (endTimeOne - startTimeOne) + "纳秒");
        System.out.println("冒泡排序程序运行时间：" + (endTimeTwo - startTimeTwo) + "纳秒");
        System.out.println("插入排序程序运行时间：" + (endTimeThree - startTimeThree) + "纳秒");
        System.out.println("Shell排序程序运行时间：" + (endTimeFour - startTimeFour) + "纳秒");
        System.out.println("快速排序程序运行时间：" + (endTimeFive - startTimeFive) + "纳秒");
    }
}
