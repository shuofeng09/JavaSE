package day01.数组操作;

/**
 * @author Wishlove09
 */
public class ArrayDemo01 {
    /*
    * JVM内存划分
    * 寄存器   给CPU使用的与开发无关
    * 本地方法栈 JVM在使用操作系统功能的时候使用，和我们开发无关
    * 方法区   存储可以运行的class文件
    * 堆内存   存储对象或者数组，new来创建的，都存储在堆内存
    * 方法栈   方法运行时使用的内存，比如main方法运行，进入方法栈中执行
    * */

    public static void main(String[] args) {
        //一个数组在内存样子
        int[] array = new int[3];
        //结果是 -->  [I@3ac3fd8b
        System.out.println(array);
        //上述结果是数组在内存中地址，而数组中具体的值都是存储在堆内存中，array变量只是存储了数组的地址


        //两个变量指向同一个数组
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1[0]+arr1[1]+arr1[2]);
        //定义一个新的数组变量，将arr1的地址付给arr2
        int[] arr2 = arr1;
        arr2[0] = 3;
        System.out.println(arr1[0]);

    }


}
