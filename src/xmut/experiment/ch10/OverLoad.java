package xmut.experiment.ch10;

import java.util.Arrays;

/**
 * @author 朔风
 * @date 2023-11-24 20:17
 */
public class OverLoad {
    public static void main(String[] args) {
        sort(12, 30);
        sort(40, 12, 30);
        sort(8, 12, 16, 16, 23, 34, 44, 52, 67, 98);
    }

    public static void sort(int num1, int num2) {
        System.out.print("两个数的排序结果：");
        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }

    public static void sort(int num1, int num2, int num3) {
        int[] array = new int[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        reverse(array);
        System.out.print("三个数的排序结果：");
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void sort(int num1, int... nums) {
        int[] array = new int[nums.length + 1];
        array[0] = num1;
        System.arraycopy(nums, 0, array, 1, nums.length);
        Arrays.sort(array);
        System.out.print("数组的排序结果：");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // 交换元素
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            // 移动指针
            start++;
            end--;
        }
    }


}
