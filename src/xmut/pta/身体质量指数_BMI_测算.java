package xmut.pta;

import java.util.Scanner;

public class 身体质量指数_BMI_测算 {
    // 体重（以千克为单位）除以身高（以米为单位）的平方
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] nums = sc.nextLine().split("\\s+");
            double weight = Double.parseDouble(nums[0]);
            double height = Double.parseDouble(nums[1]);
            if ((weight <= 0 || weight > 727) || (height <= 0 || height > 2.72)) {
                System.out.println("input out of range");
                continue;
            }
            double BMI = weight / Math.pow(height, 2);
            if (BMI < 18.5) {
                System.out.println("thin");
            } else if (BMI >= 18.5 && BMI < 24) {
                System.out.println("fit");
            } else if (BMI >= 24 && BMI < 28) {
                System.out.println("overweight");
            } else if (BMI >= 28) {
                System.out.println("fat");
            }
        }
    }
}
