package xmut.test;

import java.util.Scanner;

/**
 * @author 朔风
 * @date 2023-12-25 17:02
 */
public class 字符串加密12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String key = sc.nextLine();
            String text = "";
            for (int i = 0; i < line.length(); i++) {
                text += (char) (line.charAt(i) + key.charAt(i % key.length()) - '0');
            }
            System.out.println(text);
        }
    }
}
