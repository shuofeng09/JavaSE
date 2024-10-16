package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 14:01
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            int[][] yh = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j) {
                        yh[i][j] = 1;
                    } else {
                        yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
                    }
                    System.out.printf("%-4d", yh[i][j]);
                }
                System.out.println();
            }


        }
    }
}
