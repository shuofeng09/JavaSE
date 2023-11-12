package xmut.pta;

import java.util.Scanner;

public class 数据类型_3_计算飞行员到最近机场的距离 {
    // 距离distance=高度hight/ tan(degree)。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] nums = sc.nextLine().split("\\s+");
            System.out.printf("%.2f%n", Double.parseDouble(nums[0]) / Math.tan(Double.parseDouble(nums[1])));
        }
    }
}
