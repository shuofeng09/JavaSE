package day01.数组操作;

/**
 * @author Wishlove09
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //数组便利

        int[] arr = {1, 2, 3, 4, 5};
        //常规写法
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n=================");
        //for循环增强版写法
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n=================");


        //获取数组最大值
        int[] arr1 = {5, 200, 6000, 70, 800};
        //定义一个临时变量存储最大值
        int maxNum = arr1[0];
        //遍历数组取出每个元素
        for (int i : arr1) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println(maxNum);

        System.out.println("=================");
        //数组反转
        int[] arr2 = {1, 2, 3, 4, 5};
        /*
         * 定义数组最小的索引值min=0
         * 定义数组最大的索引值max=arr2.length-1
         * */
        for (int min = 0, max = arr2.length-1; arr2[min] < arr2[max]; min++, max--) {
            //定义一个临时变量用来存储元素交换的值
            int tmp = arr2[min];
            arr2[min] = arr2[max];
            arr2[max] = tmp;
        }
        //遍历循环后的数组
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
