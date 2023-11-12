package xmut.experiment.ch05;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int n = Integer.parseInt(line);
            if (n < 0) {
                System.out.println("请输入正整数！请重新输入！");
                continue;
            }
            int sum = 1;
            while (n > 0) {
                sum = n * sum;
                n--;
            }
            System.out.println(line + "的阶乘为：" + sum);
        }
    }
}
