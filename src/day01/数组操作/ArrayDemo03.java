package day01.数组操作;

/**
 * @author Wishlove09
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }

    /**
    * @Description: 定义一个方法，接受类型为数组的参数
    * @Param: @param arr[]
    * @return: void
    */
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
