package xmut.experiment.ch13;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-08 11:29
 */
class BMI {
    public static double calculator(int weigh, double height) throws Exception {
        double bmi = weigh / (height * height);
        if (bmi >= 28) {
            throw new Exception();
        }
        return bmi;
    }
}

public class TestBMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（kg）：");
        while (sc.hasNext()) {
            int weigh = Integer.parseInt(sc.nextLine());
            System.out.println("请输入身高（m）：");
            double height = Double.parseDouble(sc.nextLine());
            double bmi = 0;
            try {
                bmi = BMI.calculator(weigh, height);
            } catch (Exception e) {
                System.out.println("体重超重：多运动");
                continue;
            }
            System.out.println(bmi);
            System.out.println("请输入体重（kg）：");
        }

    }

}

