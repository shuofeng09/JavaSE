package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 13:49
 */
public class 谁是最强的女汉子1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[100];
        int[] y = new int[100];
        while (sc.hasNextLine()) {
            int t = sc.nextInt();
            // 找出5个人中最小的漂亮值
            int min_x = 999;
            for (int i = 0; i < t; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                if (x[i] < min_x) {
                    min_x = x[i];
                }
            }
            // 女汉子的人数
            int count = 0;
            // 力量值总和
            int sum = 0;
            for (int i = 0; i < t; i++) {
                if (min_x == x[i]) {
                    count++;
                    sum += y[i];
                }
            }

            System.out.println(count + " " + sum);

        }

    }
}
