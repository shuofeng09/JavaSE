package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 13:36
 */
public class 我是升旗手1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine());
            String[] split = scanner.nextLine().split(" ");
            int max = 0;
            for (String s : split) {
                int height = Integer.parseInt(s);
                if (height > max) {
                    max = height;
                }
            }
            System.out.println(max);

        }
    }
}
