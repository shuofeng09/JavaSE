package day03.多线程;

/**
 * @author 朔风
 * @createTime 2022-08-08 22:20
 */
public class CpuNums {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        int nums = runtime.availableProcessors();

        System.out.println("cpu核心数: " + nums);
    }
}
