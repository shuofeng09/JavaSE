package xmut.pta;

import java.util.Scanner;

public class 顺序结构_1_利用海伦公式求三角形面积_了解世界科学史 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] nums = sc.nextLine().split("\\s+");
            double a = Double.parseDouble(nums[0]);
            double b = Double.parseDouble(nums[1]);
            double c = Double.parseDouble(nums[2]);
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                double p = (a + b + c) / 2;
                double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(S);
            }else {
                System.out.println("Input Error!");
            }
        }
    }
}
