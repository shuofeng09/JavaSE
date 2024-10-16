package xmut.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 16:00
 */
public class 使用异常机制处理异常输入12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                try {
                    ints[i] = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println(e);
                    i--;
                }
            }
            System.out.println(Arrays.toString(ints));
        }

    }
}
