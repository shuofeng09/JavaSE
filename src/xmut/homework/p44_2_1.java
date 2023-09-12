package xmut.homework;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-09-12 20:44
 */
public class p44_2_1 {
    public static void main(String[] args) {
        System.out.print("请输入两个整数: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] nums = line.split(" ");

        int result = GCD(Integer.valueOf(nums[0]), Integer.valueOf(nums[1]));

        System.out.println(nums[0] + "和" + nums[1] + "最大公约数是 "+result);
    }

    private static int GCD(Integer num1, Integer num2) {
        int result = 0;
        while (num2 != 0) {
            result = num1 % num2;
            num1 = num2;
            num2 = result;
        }
        return num1;
    }

}
