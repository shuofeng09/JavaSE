package xmut.pta;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-05 22:00
 */
public class 异常_02_使用异常机制处理异常输入 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int length = Integer.parseInt(sc.nextLine());
            int[] array = new int[length];

            for (int i = 0; i < length; i++) {
                String line = sc.nextLine();
                try {
                    int num = Integer.parseInt(line);
                    array[i] = num;
                } catch (NumberFormatException e) {
                    i--;
                    System.out.println(e);
                }
            }

            System.out.println(Arrays.toString(array));

        }

    }
}
