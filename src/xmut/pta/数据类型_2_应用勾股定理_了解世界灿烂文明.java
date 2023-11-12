package xmut.pta;

import java.util.Scanner;

public class 数据类型_2_应用勾股定理_了解世界灿烂文明 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String[] nums = in.nextLine().split(" ");
            double result = Math.pow(Double.parseDouble(nums[0]),2)+Math.pow(Double.parseDouble(nums[1]),2);
            System.out.printf("%.2f",Math.sqrt(result));
            System.out.println();
        }
    }
}
