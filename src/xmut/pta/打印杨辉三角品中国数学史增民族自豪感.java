package xmut.pta;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-11-12 10:49
 */
public class 打印杨辉三角品中国数学史增民族自豪感 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            int[][] yanghui = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) {
                        yanghui[i][j] = 1;
                    } else {
                        yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                    }
                    System.out.printf("%-4d", yanghui[i][j]);
                }
                System.out.println();
            }
        }
    }
}
